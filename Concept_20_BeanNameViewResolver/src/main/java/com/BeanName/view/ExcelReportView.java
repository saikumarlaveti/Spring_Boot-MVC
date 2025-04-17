package com.BeanName.view;

import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractXlsView;

import com.BeanName.Model.Employee;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component("excel_report")
public class ExcelReportView extends AbstractXlsView {

	private int i = 1;
	@Override
	protected void buildExcelDocument(Map<String, Object> map, Workbook workbook, HttpServletRequest req,
			HttpServletResponse res) throws Exception {
		List<Employee> list = (List<Employee>)map.get("empslist");
		
		Sheet sheet1 = workbook.createSheet("Employee");
		
		Row row1 = sheet1.createRow(0);
		
		row1.createCell(0).setCellValue("EMPNO");
		row1.createCell(1).setCellValue("ENAME");
		row1.createCell(2).setCellValue("JOB");
		row1.createCell(3).setCellValue("SAL");
		row1.createCell(4).setCellValue("DEPTNAME");
		
		list.forEach(emp->{
			Row row = sheet1.createRow(i);
			
			row.createCell(0).setCellValue(emp.getEmpNo());
			row.createCell(1).setCellValue(emp.getEmpName());
			row.createCell(2).setCellValue(emp.getJob());
			row.createCell(3).setCellValue(emp.getSalary());
			
			if(emp.getDeptName()!=null)
			row.createCell(4).setCellValue(emp.getDeptName());
			i++;

		});

	}
	
	

} 