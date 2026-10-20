package com.org.lob.std.service.specification;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

import com.org.lob.std.repository.entity.Student;
import com.org.lob.std.service.model.StudentSearchRequest;

public class StudentSpecification implements Specification<Student> {

	private static final long serialVersionUID = 1L;
	private final StudentSearchRequest studentSearchRequest;

	public StudentSpecification(StudentSearchRequest studentSearchRequest) {
		this.studentSearchRequest = studentSearchRequest;
	}

	@Override
	public Predicate toPredicate(Root<Student> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
		List<Predicate> predicates = new ArrayList<>();
		if (studentSearchRequest.studentIdFilteringRequired()) {
			predicates.add(criteriaBuilder.equal(root.get("studentId"), studentSearchRequest.getStudentId()));
		}
		if (studentSearchRequest.nameFilteringRequired()) {
			predicates.add(criteriaBuilder.like(root.get("name"), studentSearchRequest.getName() + "%"));
		}
		return andTogether(predicates, criteriaBuilder);
	}

	private Predicate andTogether(List<Predicate> predicates, CriteriaBuilder cb) {
		return cb.and(predicates.toArray(new Predicate[0]));
	}
}