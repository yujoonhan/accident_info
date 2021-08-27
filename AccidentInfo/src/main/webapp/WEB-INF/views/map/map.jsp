<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>지도 정보</title>
    <script src="/assets/js/map.js"></script>
    <script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=9690c185cffddbedc14fd293bb5bc1b6"></script>
    
</head>
<body>
    <div class="container">
        <%@include file="/WEB-INF/views/includes/menu.jsp"%>
        <div class="dashboard_area">
            <div id="map" style="width:950px;height:600px;"></div>
	            <script>
		            var container = document.getElementById('map');
		            var options = {
		            	center: new kakao.maps.LatLng(33.450701, 126.570667),
		            	level: 3
		            };
                
		            var map = new kakao.maps.Map(container, options);
	            </script>
        </div>
    </div>
</body>
</html>