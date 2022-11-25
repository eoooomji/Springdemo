$(document).ready(function(){
	$('#btn').click(process);
});

/*
function process(){
	$.ajax({
		type:'GET',
		dataType:'json',
		url:'searchOpen.do?query=' + $('#search').val(),
		success:viewMessage,
		error:function(xhr, textStatus, error) {
			alert(xhr.status);
		}
	});
}
*/

function process(){
	alert('text');
	$.ajax({
		type:'GET',
		url:'https://dapi.kakao.com/v3/search/book?target=title',
		headers:{"Authorization":"KakaoAK e33944707a41367dc31ab92e4ddb1876"},
		dataType:'json',
		data:{"query":$('#search').val()},
		success:viewMessage
	});
}

function viewMessage(res){
	$.each(res.documents, function(index, element){
		$('#wrap table').append(`<tr>
								 <td>${element.title}</td>
								 <td><a href="${element.url}"><img src="${element.thumbnail}"/></a></td>
								 <td>${element.price}</td>
								 </tr>`);
	});
}