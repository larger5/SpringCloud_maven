package com.cun.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cun.entity.Student;
import com.cun.service.StudentService;

/**
 * 服务提供者
 * 基于 http rest方式交互，服务提供者的参数要加上 @RequestBody，否则接收不到数据
 * 
 * @author linhongcun
 *
 */
@RestController
@RequestMapping("/student")
public class StudentProviderController {
	
	@Resource
	private StudentService studentService;

	/**
	 * 添加或者修改学生信息
	 * @param student
	 * @return
	 */
	@PostMapping(value = "/save")
	public boolean save(@RequestBody Student student) {
		try {
			studentService.save(student);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * 查询学生信息
	 * @return
	 */
	@GetMapping(value = "/list")
	public List<Student> list() {
		return studentService.list();
	}

	/**
	 * 根据id查询学生信息
	 * @return
	 */
	@GetMapping(value = "/get/{id}")
	public Student get(@RequestBody @PathVariable("id") Integer id) {
		return studentService.findById(id);
	}

	/**
	 * 根据id删除学生信息
	 * @return
	 */
	@GetMapping(value = "/delete/{id}")
	public boolean delete(@RequestBody @PathVariable("id") Integer id) {
		try {
			studentService.delete(id);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
