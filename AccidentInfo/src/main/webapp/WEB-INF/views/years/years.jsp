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
    <link rel="stylesheet" href="/assets/css/years.css">
    <script src="/assets/js/years.js"></script>
</head>
<body>
    <div class="container">
        <%@include file="/WEB-INF/views/includes/menu.jsp"%>
        <div class="dashboard_area">
            <select name="region_select">
                <option value="서울">서울특별시</option>
                <option value="부산">부산광역시</option>
                <option value="대구">대구광역시</option>
                <option value="인천">인천광역시</option>
                <option value="광주">광주광역시</option>
                <option value="대전">대전광역시</option>
                <option value="울산">울산광역시</option>
                <option value="세종">세종특별자치시</option>
                <option value="경기">경기도</option>
                <option value="강원">강원도</option>
                <option value="충청북도">충청북도</option>
                <option value="충청남도">충청남도</option>
                <option value="전라북도">전라북도</option>
                <option value="전라남도">전라남도</option>
                <option value="경상북도">경상북도</option>
                <option value="경상남도">경상남도</option>
                <option value="제주">제주특별자치시</option>
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
            <div class="year_Aarea">

            </div>
        </div>
    </div>
</body>
</html>