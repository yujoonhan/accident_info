<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>지역별 보행 사고 정보</title>
    <link rel="stylesheet" href="/assets/css/regional.css">
    <link rel="stylesheet" href="/assets/js/regional.js">
</head>
<body>
    <div class="container">
        <%@include file="/WEB-INF/views/includes/menu.jsp"%>
        <div class="dashboard_area">
            <div class="region_area">
                <div class="dashboard_content">
                    <div class="content_left">
                        <canvas id="region_old_chart" style="width: 100%; height: 100%;"></canvas>
                    </div>
                    <div class="content_right">
                        <canvas id="region_chd_chart" style="width: 100%; height: 100%;"></canvas>
                    </div>
                </div>
                <div class="dashboard_content">
                    <div class="content_left">
                        <canvas id="region_byc_chart" style="width: 100%; height: 100%;"></canvas>
                    </div>
                </div>
                <div class="dashboard_content">
                    <div>
                        <p>서울</p>
                        <p id="oldCnt"><span>노인</span> 123</p>
                        <p id="chdCnt"><span>어린이</span>123</p>
                        <p id="bycCnt"><span>자전거</span>123</p>
                    </div>
                    <div>
                        <p>부산</p>
                        <p id="oldCnt"><span>노인</span> 123</p>
                        <p id="chdCnt"><span>어린이</span>123</p>
                        <p id="bycCnt"><span>자전거</span>123</p>
                    </div>
                    <div>
                        <p>대구</p>
                        <p id="oldCnt"><span>노인</span> 123</p>
                        <p id="chdCnt"><span>어린이</span>123</p>
                        <p id="bycCnt"><span>자전거</span>123</p>
                    </div>
                    <div>
                        <p>인천</p>
                        <p id="oldCnt"><span>노인</span> 123</p>
                        <p id="chdCnt"><span>어린이</span>123</p>
                        <p id="bycCnt"><span>자전거</span>123</p>
                    </div>
                    <div>
                        <p>광주</p>
                        <p id="oldCnt"><span>노인</span> 123</p>
                        <p id="chdCnt"><span>어린이</span>123</p>
                        <p id="bycCnt"><span>자전거</span>123</p>
                    </div>
                </div>
                <div class="dashboard_content">
                    <div>
                        <p>대전</p>
                        <p id="oldCnt"><span>노인</span> 123</p>
                        <p id="chdCnt"><span>어린이</span>123</p>
                        <p id="bycCnt"><span>자전거</span>123</p>
                    </div>
                    <div>
                        <p>울산</p>
                        <p id="oldCnt"><span>노인</span> 123</p>
                        <p id="chdCnt"><span>어린이</span>123</p>
                        <p id="bycCnt"><span>자전거</span>123</p>
                    </div>
                    <div>
                        <p>세종</p>
                        <p id="oldCnt"><span>노인</span> 123</p>
                        <p id="chdCnt"><span>어린이</span>123</p>
                        <p id="bycCnt"><span>자전거</span>123</p>
                    </div>
                    <div>
                        <p>경기</p>
                        <p id="oldCnt"><span>노인</span> 123</p>
                        <p id="chdCnt"><span>어린이</span>123</p>
                        <p id="bycCnt"><span>자전거</span>123</p>
                    </div>
                    <div>
                        <p>강원</p>
                        <p id="oldCnt"><span>노인</span> 123</p>
                        <p id="chdCnt"><span>어린이</span>123</p>
                        <p id="bycCnt"><span>자전거</span>123</p>
                    </div>
                </div>
                <div class="dashboard_content">
                    <div>
                        <p>충북</p>
                        <p id="oldCnt"><span>노인</span> 123</p>
                        <p id="chdCnt"><span>어린이</span>123</p>
                        <p id="bycCnt"><span>자전거</span>123</p>
                    </div>
                    <div>
                        <p>충남</p>
                        <p id="oldCnt"><span>노인</span> 123</p>
                        <p id="chdCnt"><span>어린이</span>123</p>
                        <p id="bycCnt"><span>자전거</span>123</p>
                    </div>
                    <div>
                        <p>전북</p>
                        <p id="oldCnt"><span>노인</span> 123</p>
                        <p id="chdCnt"><span>어린이</span>123</p>
                        <p id="bycCnt"><span>자전거</span>123</p>
                    </div>
                    <div>
                        <p>전남</p>
                        <p id="oldCnt"><span>노인</span> 123</p>
                        <p id="chdCnt"><span>어린이</span>123</p>
                        <p id="bycCnt"><span>자전거</span>123</p>
                    </div>
                    <div>
                        <p>경북</p>
                        <p id="oldCnt"><span>노인</span> 123</p>
                        <p id="chdCnt"><span>어린이</span>123</p>
                        <p id="bycCnt"><span>자전거</span>123</p>
                    </div>
                </div>
                <div class="dashboard_content">
                    <div>
                        <p>경남</p>
                        <p id="oldCnt"><span>노인</span> 123</p>
                        <p id="chdCnt"><span>어린이</span>123</p>
                        <p id="bycCnt"><span>자전거</span>123</p>
                    </div>
                    <div>
                        <p>제주</p>
                        <p id="oldCnt"><span>노인</span> 123</p>
                        <p id="chdCnt"><span>어린이</span>123</p>
                        <p id="bycCnt"><span>자전거</span>123</p>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>