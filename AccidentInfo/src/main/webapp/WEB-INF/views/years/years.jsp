<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="http://code.jquery.com/jquery-3.4.1.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/chart.js@3.5.0/dist/chart.min.js"></script>
    <title>연도볗 보행 사고 정보</title>
    <!-- <link rel="stylesheet" href="/assets/css/years.css"> -->
    <script src="/assets/js/years.js"></script>
</head>
<body>
    <div class="container">
        <%@include file="/WEB-INF/views/includes/menu.jsp"%>
        <div class="dashboard_area">
            <select name="region_select">
                <option value="서울">서울</option>
                <option value="대구">대구</option>
                <option value="부산">부산</option>
            </select>
            <div class="dashboard_content">
                <div class="content_left">
                    <canvas id="years_old_chart" style="width: 100%; height: 100%;"></canvas>
                </div>
                <div class="content_left">
                    <canvas id="years_chd_chart" style="width: 100%; height: 100%;"></canvas>
                </div>
                
            </div>
            <div class="dashboard_content">
                <div class="content_left">
                    <canvas id="years_byc_chart" style="width: 100%; height: 100%;"></canvas>
                </div>
                <div class="content_left">
                    <canvas id="years_all_chart" style="width: 100%; height: 100%;"></canvas>
                </div>
            </div>
            <div class="year_Oarea">

            </div>
            <div class="year_Carea">

            </div>
            <div class="year_Barea">

            </div>
        </div>
    </div>
</body>
</html>