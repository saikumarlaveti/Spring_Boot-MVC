package com.file.Controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import com.file.Entity.JobSeeker;
import com.file.Model.JobSeekerData;
import com.file.Services.JobSeekerServicesIMPL;

@Controller
public class JobSeekerController {

	@Autowired
	private  JobSeekerServicesIMPL service;
	
	@GetMapping("/")
	public String showWelcome() {
		return "welcome";
	}
	
	@GetMapping("/register")
	public String showRegisterForm(@ModelAttribute("js") JobSeekerData jsData) {
		return "jobseeker_register";
	}
	
	@Autowired
	private Environment env;
	@PostMapping("/register")
	public String registerJSByUploadingFiles(@ModelAttribute("js") JobSeekerData jsData,
			Map<String ,Object> map) throws Exception{
		
		//get upload folder locaion from properties file
		String storeLocation = env.getRequiredProperty("upload.store");
		//if that not avaiable then create it
		File file = new File(storeLocation);
		if(!file.exists())
			file.mkdir();
		
		//get InputStreams represnet in the upload files content
		MultipartFile resumeFile = jsData.getResume();
		MultipartFile photoFile = jsData.getPhoto();
		
		InputStream isResume = resumeFile.getInputStream();
		InputStream isPhoto = photoFile.getInputStream();
		//get the names of the uploaded files
		String resumeFileName = resumeFile.getOriginalFilename();
		String photoFileName = photoFile.getOriginalFilename();
		//create outstreams representing empty destination files
		OutputStream osResume = new FileOutputStream(file.getAbsolutePath() +"\\" +resumeFileName);
		OutputStream osPhoto = new FileOutputStream(file.getAbsolutePath() +"\\" +photoFileName);
		//preform file copy operation
		IOUtils.copy(isResume, osResume);
		IOUtils.copy(isPhoto,osPhoto);
		//close stream
		isResume.close();
		osResume.close();
		isPhoto.close();
		osPhoto.close();
		//Prepare Entity class obj from Model class obj
		JobSeeker js = new JobSeeker();
		js.setName(jsData.getName());
		js.setAddress(jsData.getAddress());
		js.setResumePath(file.getAbsolutePath() + "/" + resumeFileName);
		js.setPhotoPath(file.getAbsolutePath()+"/" +photoFileName);
		//use service
		String msg = service.JobSeekerRegister(js);
		map.put("file1", resumeFileName);
		map.put("file2", photoFileName);
		map.put("resultMsg",msg);
		//return LVN
		return "show_result";
	}
}
