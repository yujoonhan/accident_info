<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="https://cdn.jsdelivr.net/npm/chart.js@3.5.0/dist/chart.min.js"></script>
    <title>지역별 보행 사고 정보</title>
    <link rel="stylesheet" href="/assets/css/regional.css">
    <script src="http://code.jquery.com/jquery-3.4.1.min.js"></script>
    <script src="/assets/js/regional.js"></script>
</head>
<body>
    <div class="container">
        <%@include file="/WEB-INF/views/includes/menu.jsp"%>
        <div class="dashboard_area">
            <select name="year_select">
                <option value="2020-01-01">2020-01-01</option>
                <option value="2019-01-01">2019-01-01</option>
                <option value="2018-01-01">2018-01-01</option>
                <option value="2017-01-01">2017-01-01</option>
                <option value="2016-01-01">2016-01-01</option>
                <option value="2015-01-01">2015-01-01</option>
            </select>
            <div class="dashboard_content">
                <div class="content_left">
                    <canvas id="region_old_chart" style="width: 100%; height: 100%;"></canvas>
                </div>
                <div class="content_left">
                    <canvas id="region_chd_chart" style="width: 100%; height: 100%;"></canvas>
                </div>
            </div>
            <div class="dashboard_content">
                <div class="content_left">
                    <canvas id="region_byc_chart" style="width: 100%; height: 100%;"></canvas>
                </div>
                <div class="content_left">
                    <canvas id="region_all_chart" style="width: 100%; height: 100%;"></canvas>
                </div>
            </div>
            <div class="sido_Aarea">

            </div>
        </div>
    </div>
</body>
</html>