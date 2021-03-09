function validateCarForm(frm){
	var regNo = frm.registrationNo.value;
	var mileage = frm.mileage.value;
	
	if(regNo == "") {
		alert("Registraction Number is required");
		return false;
	}
	if(mileage == "") {
		alert("mileage is required");
		return false;
	} else if (isNaN(mileage)){
		alert("mileage should be number");
		return false;
	}
	
	return true;
}

function goHome(frm) {
	frm.action = "home.do";
	frm.submit();
}