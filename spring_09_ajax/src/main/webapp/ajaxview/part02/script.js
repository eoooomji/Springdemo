
let httpRequest;

let btn = document.querySelector("#btn")
btn.onclick = process;

function process(){
	// 1. ajax를 처리하기 위한 브라우저별 객체 생성
	if(window.XMLHttpRequest){
		httpRequest = new XMLHttpRequest();
	} else {
		httpRequest = ActiveXObject('Microsoft.XMLHTTP'); // IE6 이하
	}
	
	// 2. 서버가 응답한 테이터를 처리하기 위한 함수를 정의 한 후 등록
	httpRequest.onreadystatechange = viewMessage;
	
	// 3. 서버에 요청 준비
	httpRequest.open('POST', 'name.do', true);
	
	httpRequest.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
	
	// 4. 서버 요청
	httpRequest.send('name=' + document.querySelector("#name").value);
	
} // end process()

// 서버로부터 응답을 받았을 때 수행할 함수 정의
function viewMessage(){
	if(httpRequest.readyState == 4 && httpRequest.status == 200){
		document.querySelector("#wrap").innerHTML = httpRequest.responseText;
	}
} // end viewMessage()
