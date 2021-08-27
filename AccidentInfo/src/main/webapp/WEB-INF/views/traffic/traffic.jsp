<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="https://cdn.jsdelivr.net/npm/chart.js@3.5.0/dist/chart.min.js"></script>
    <title>교통량 정보</title>
    <link rel="stylesheet" href="/assets/css/traffic.css">
    <script src="http://code.jquery.com/jquery-3.4.1.min.js"></script>
    <script src="/assets/js/traffic.js"></script>
</head>
    <div class="container">
        <%@include file="/WEB-INF/views/includes/menu.jsp"%>
        <div class="dashboard_area">
            <div class="dashboard_content">
                <div class="content_left2">
                    <canvas id="yearsAll_chart" style="width: 100%; height: 100%;"></canvas>
                </div>
                <div class="content_left2">
                    <canvas id="traffic_m_chart" style="width: 100%; height: 100%;"></canvas>
                </div>
            </div>
            <div class="dashboard_content">
                <div class="content_left2">
                    <canvas id="traffic_s_chart" style="width: 100%; height: 100%;"></canvas>
                </div>
                <div class="content_left2">
                    <canvas id="traffic_l_chart" style="width: 100%; height: 100%;"></canvas>
                </div>
            </div>
            <div class="dashboard_content">
                <div class="content_left2">
                    <canvas id="traffic_car_chart" style="width: 100%; height: 100%;"></canvas>
                </div>
            </div>
        </div>
    </div>

</script>
<body>