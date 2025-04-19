package com.BeanName.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.BeanName.Model.Employee;
import com.lowagie.text.Document;
import com.lowagie.text.Font;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfWriter;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component("pdf_report")
public class PdfReportView extends AbstractPdfView{

	@Override
	protected void buildPdfDocument(Map<String, Object> map, Document doc, PdfWriter writer,
			HttpServletRequest req, HttpServletResponse res) throws Exception {
List<Employee> list =(List<Employee>)map.get("empslist");
		
		Paragraph para = new Paragraph("Employee Report",new Font(Font.TIMES_ROMAN,
				Font.DEFAULTSIZE,
				Font.BOLDITALIC));
		Table table = new Table(5,((ArrayList)list).size());
		for(Employee emp:list) {
			table.addCell(String.valueOf(emp.getEmpNo()));
			table.addCell(emp.getEmpName());
			table.addCell(emp.getJob());
			table.addCell(String.valueOf(emp.getSalary()));
			
			if(emp.getDeptName()!=null)
				table.addCell(String.valueOf(emp.getDeptName()));
			else {
				table.addCell("--------------");
			}
		}				
		doc.add(table);

	}
		
	}

	

		


