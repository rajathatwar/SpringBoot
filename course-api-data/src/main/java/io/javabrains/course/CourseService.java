package io.javabrains.course;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;

	public List<Course> getAllCoursesFromBusinessService(String topicId) {

		List<Course> allCourses = new ArrayList<>();
		courseRepository.findByTopicId(topicId).
		forEach(allCourses::add);

		return allCourses;
	}

	public Optional<Course> getCourse(String id) {
		return courseRepository.findById(id);
		
	}

	public void addCourse(Course course) {
		courseRepository.save(course);
	}

	public void updatTopic(Course course) {
		courseRepository.save(course);

	}

	public void deleteCourse(String id) {
		courseRepository.deleteById(id);

	}

}
