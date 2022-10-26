<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<script type="text/javascript">

	//arr1과 arr2의 요소를 처음부터 하나 씩 교차
	function shuffle_arr(arr1, arr2){
		let result = [];
		
		while(arr1.length > 0 || arr2.length > 0){
			//각 배열의 첫번째 요소를 제거하고 그 값을 result에 추가
			if(arr1.length !== 0){
				result.push(arr1.shift());
			}
			if(arr2.length !== 0){
				result.push(arr2.shift());
			}
		}
		
		return result
	}
</script>



</head>
<body>

</body>
</html>