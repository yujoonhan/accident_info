<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="https://cdn.jsdelivr.net/npm/chart.js@3.5.0/dist/chart.min.js"></script>
    <title>무단횡단 보행 사고 정보</title>
    <link rel="stylesheet" href="/assets/css/jwalking.css">
    <script src="http://code.jquery.com/jquery-3.4.1.min.js"></script>
    <script src="/assets/js/jwalking.js"></script>
</head>
    <div class="container">
        <%@include file="/WEB-INF/views/includes/menu.jsp"%>
        <div class="dashboard_area">
            <div class="dashboard_content">
                <div class="content_left2">
                    <canvas id="yearsAll_chart" style="width: 100%; height: 100%;"></canvas>
                </div>
                <div class="content_left2">
                    <canvas id="jwalking_year_chart" style="width: 100%; height: 100%;"></canvas>
                </div>
            </div>
        </div>
    </div>

</script>
<body>