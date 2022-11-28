function init(chk){
	console.log("init chk =>" + chk);
	
	if(chk){
		$('#logInPage').removeClass('hidePage').addClass('showPage');
		$('#logOutPage').removeClass('showPage').addClass('hidePage');
	} else{
		$('#logOutPage').removeClass('hidePage').addClass('showPage');
		$('#logInPage').removeClass('showPage').addClass('hidePage');
	}
}