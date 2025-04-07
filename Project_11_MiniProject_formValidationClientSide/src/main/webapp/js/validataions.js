function validation(frm){

	document.getElementById("enameErr").innerHTML="";
	document.getElementById("jobErr").innerHTML="";
	document.getElementById("salErr").innerHTML="";
	

	let ename = frm.ename.value;
	let job = frm.job.value;
	let sal = frm.salary.value;
	
	let flag = true;
	frm.vflag.value="yes";
	
	if(ename == ""){
		document.getElementById("enameErr").innerHTML="Employee name is mandatory(cs)";
		flag = false;
	}
	else if(ename.length>10){
		document.getElementById("enameErr").innerHTML="Employee name must have max of 10 chars(cs) ";
		flag = false;
	}
	if(job ==""){
		document.getElementById("jobErr").innerHTML="Employee desg is required(cs) ";
		flag = false;
	}
	else if(job.length>9){
		document.getElementById("jobErr").innerHTML="Employee desg can have max 9 character (cs) ";
		flag = false;
	}
	
	if(sal ==""){
		document.getElementById("salErr").innerHTML="Employee salary is required (cs)";
		flag=false;
	}
	else if(sal<0||sal>100000){
		document.getElementById("salErr").innerHTML="Employee salary is required (cs)";
		flag=false;
	}
	return flag;
}