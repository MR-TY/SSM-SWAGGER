package com.ty.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ty.entity.Department;
import com.ty.entity.Msg;
import com.ty.service.DeptService;
/**
* @Description: ajax鍙戦�佽姹傦紝閫氳繃锛屽悗绔噰闆嗘墍鏈夌殑閮ㄩ棬瀵硅薄锛屽苟涓斾互json鐨勫璞¤繑鍥烇紝bootstrap鐢╦s瀵筳son鏁版嵁杩涜瑙ｆ瀽
* @ClassName: DeptController.java
* @version: v1.0.0
* @author: 
* @date: 2018骞�1鏈�3鏃� 涓婂崍11:31:30
 */
@Controller
public class DeptController {
	@Autowired
	private DeptService deptService;

	@RequestMapping("depts")
	@ResponseBody
	public Msg getEmpsWithJson() throws InterruptedException {
		System.out.println("杩涘叆閮ㄩ棬鏌ヨ浜�");
		List<Department> departments = deptService.findAllDepts();
		return Msg.success().returnJson("dept", departments);
	}
}
