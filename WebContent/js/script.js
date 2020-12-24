
function validCheck(){
	var id=document.fm.regno.value;
	var name=document.fm.name.value;
	var age=document.fm.age.value;
	var email=document.fm.email.value;
	var number=document.fm.number.value;
	var date=document.fm.date.value;
	var mail=/^\w+@[a-zA-Z_]+?\.[a-zA-Z]{2,3}$/;
	var datecheck=/^([0-9]|[0-2][0-9]|[3][0-1])-(Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec)-\d{4}$/ ;
	
	if(id==null || id==""){
		alert('id is not entered');
		return false;
	}
	else if(name==null || name==""){
		alert('name not entered');
		return false;
	}
	else if(age==null || age==""){
		alert('age is not entered');
		return false;
	}
	else if(email==null || email==""){
		alert('email not entered');
		return false;
	}
	else if(number==null || number==""){
		alert('number not entered');
		return false;
	}
	else if(date==null || date==""){
		alert('Date is not entered');
		return false;
	}
	else if(!(number.length==10)){
		alert('Enter valid mobile number');
		return false;
	}
	else if(name.length<=4){
		alert('Enter the valid name');
		return false;
	}
	
	else if(!email.match(mail))
	{
		alert('Enter a valid email');
		return false;
	}
	
	if(!date.match(datecheck)){
		alert('Enter a valid Date');
		return false;
	}
}

function validInput(input,event){
	
	var inp=input.name;
	
	if(inp=='regno'){
		var key=event.keyCode;
		if(!(key>=48 && key<=57)){
			return false;
			}
	}
	else if(inp=='name'){
		/*
		var key=event.keyCode;
		if(!((key>=65 && key<=90) || (key>=97 && key<=122) || (key==32) || (key==46)))
				return false;
		*/
		var nam=/^[a-zA-Z ]{3,20}$/;
		if(!(name.match(nam))){
			alert('');
			return false;
		}
		}
	else if(inp=='age'){
		var key=event.keyCode;
		if(!(key>=48 && key<=57)){
			return false;
			}
	}
	else if(inp=='number'){
		var key=event.keyCode;
		if(!(key>=48 && key<=57)){
			return false;
			}
	}
	
	
	
}
