<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>보행 사고 정보 대시보드</title>
    <script src="http://code.jquery.com/jquery-3.4.1.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/chart.js@3.5.0/dist/chart.min.js"></script>
    <script src="/assets/js/index.js"></script>
</head>
<body>
    <div class="container">
        <%@include file="/WEB-INF/views/includes/menu.jsp"%>
        <div class="dashboard_area">
            <div class="dashboard_content">
                <div class="content_left">
                    <img src="/assets/images/grandfather256.png">
                    <p class="con_number">${acdOldAllYearCnt.str_all_caslt_cnt}</p>
                    <p class="con_title">작년 노인 보행 사고자 수</p>
                </div>
                <div class="content_left">
                    <img src="/assets/images/daughter256.png">
                    <p class="con_number">${acdChdAllYearCnt.str_all_caslt_cnt}</p>
                    <p class="con_title">작년 어린이 보행 사고자 수</p>
                </div>
                <div class="content_left">
                    <img src="/assets/images/mountain-bike256.png">
                    <p class="con_number">${acdBycAllYearCnt.str_all_caslt_cnt}</p>
                    <p class="con_title">작년 자전거 보행 사고자 수</p>
                </div>
            </div>
            <div class="dashboard_content">
                <div class="content_left">
                    <canvas id="old_chart" style="width: 100%; height: 100%;"></canvas>
                    <p class="con_title">작년 노인 사고자 부상 비율</p>
                </div>
                <div class="content_left">
                    <canvas id="chd_chart" style="width: 100%; height: 100%;"></canvas>
                    <p class="con_title">작년 어린이 사고자 부상 비율</p>
                </div>
                <div class="content_left">
                    <canvas id="byc_chart" style="width: 100%; height: 100%;"></canvas>
                    <p class="con_title">작년 자전거 사고자 부상 비율</p>
                </div>
            </div>
            <div class="dashboard_content">
                <div class="content_left">
                    <canvas id="regionAll_chart" style="width: 100%; height: 100%;"></canvas>
                </div>
                <div class="content_left">
                    <canvas id="yearsAll_chart" style="width: 100%; height: 100%;"></canvas>
                </div>
            </div>
        </div>
    </div>

</body>
</html>