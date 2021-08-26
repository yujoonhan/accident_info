$(function(){
    // 차트를 미리 만들어주고, 데이터가 바뀔 때 업데이트를 통해서
    // 데이터를 변경
    let ctx1 = $("#years_old_chart");
    let years_old_chart = new Chart(ctx1, {
        type:"line",
        options:{
            responsive:false
        },
        data:{
            labels:null,
            datasets:[
                {
                    label:"연도별 노인 보행자 사고 수",
                    data:null,
                    backgroundColor:["rgba(255, 0, 0, 0.4)"]
                }
            ]
        }
    })
    let ctx2 = $("#years_chd_chart");
    let years_chd_chart = new Chart(ctx2, {
        type:"line",
        options:{
            responsive:false
        },
        data:{
            labels:null,
            datasets:[
                {
                    label:"연도별 어린이 보행자 사고 수",
                    data:null,
                    backgroundColor:["rgba(0, 255, 0, 0.4)"]
                }
            ]
        }
    })
    let ctx3 = $("#years_byc_chart");
    let years_byc_chart = new Chart(ctx3, {
        type:"line",
        options:{
            responsive:false
        },
        data:{
            labels:null,
            datasets:[
                {
                    label:"연도별 자전거 보행자 사고 수",
                    data:null,
                    backgroundColor:["rgba(0, 0, 255, 0.4)"]
                }
            ]
        }
    })
    let ctx4 = $("#years_all_chart");
    let years_all_chart = new Chart(ctx4, {
        type:"line",
        options:{
            responsive:false
        },
        data:null
    })

    $("#region_select").change(function(){
        let sido = $("#region_select").find("option:selected").val();
        getYearsInfo(sido);
    });

    getYearsInfo("서울특별시")

    function getYearsInfo(sido){
        $.ajax({
            type:"get",
            url:"/api/yearCnt/"+sido,
            success:function(r){
                console.log(r);
                console.log(sido);
                $(".year_Aarea").html("");
                for(let i=0; i<r.yearCnt.length; i++){
                    let tag =
                        '<div class="year_box">'+
                            '<p class="year_info">'+r.yearCnt[i].yyearDt+'</p>'+
                            '<p>'+
                                '<span>노인</span>'+
                                '<span style="margin-left:5px">'+r.yearCnt[i].old_cnt+'</span>'+
                            '</p>'+
                            '<p>'+
                                '<span>어린이</span>'+
                                '<span style="margin-left:5px">'+r.yearCnt[i].chd_cnt+'</span>'+
                            '</p>'+
                            '<p>'+
                                '<span>자전거</span>'+
                                '<span style="margin-left:5px">'+r.yearCnt[i].byc_cnt+'</span>'+
                            '</p>'+
                        "</div>";
                    $(".year_Aarea").append(tag);
                }
                let yearsDt = new Array();
                let oldCnt = new Array();
                let chdCnt = new Array();
                let bycCnt = new Array();
                for(let i=0; i<r.yearCnt.length; i++){
                    let years = r.yearCnt[i].yyearDt;
                    let cntO = r.yearCnt[i].old_cnt;
                    let cntC = r.yearCnt[i].chd_cnt;
                    let cntB = r.yearCnt[i].byc_cnt;
                    yearsDt.push(years);
                    oldCnt.push(cntO);
                    chdCnt.push(cntC);
                    bycCnt.push(cntB);
                }
                
                years_old_chart.data.datasets = new Array(); // 데이터 셋 초기화
                years_old_chart.data.labels = yearsDt; // 레이블 교체
                years_old_chart.data.datasets.push({
                    label:"연도별 노인 보행자 사고 수", 
                    data:oldCnt,
                    backgroundColor:["rgba(255, 0, 0, 0.4)"]
                });
                years_old_chart.update();

                years_chd_chart.data.datasets = new Array(); // 데이터 셋 초기화
                years_chd_chart.data.labels = yearsDt; // 레이블 교체
                years_chd_chart.data.datasets.push({
                    label:"연도별 어린이 보행자 사고 수",
                    data:chdCnt,
                    backgroundColor:["rgba(0, 255, 0, 0.4)"]
                });
                years_chd_chart.update();

                years_byc_chart.data.datasets = new Array(); // 데이터 셋 초기화
                years_byc_chart.data.labels = yearsDt; // 레이블 교체
                years_byc_chart.data.datasets.push({
                    label:"연도별 자전거 보행자 사고 수",
                    data:bycCnt,
                    backgroundColor:["rgba(0, 0, 255, 0.4)"]
                });
                years_byc_chart.update();

                years_all_chart.data.datasets = new Array(); // 데이터 셋 초기화
                years_all_chart.data.labels = yearsDt; // 레이블 교체
                years_all_chart.data.datasets.push({
                    label:"연도별 노인 보행자 사고 수",
                    data:oldCnt,
                    backgroundColor:["rgba(255, 0, 0, 0.4)"]
                });
                years_all_chart.data.datasets.push({
                    label:"연도별 어린이 보행자 사고 수",
                    data:chdCnt,
                    backgroundColor:["rgba(0, 255, 0, 0.4)"]
                });
                years_all_chart.data.datasets.push({
                    label:"연도별 자전거 보행자 사고 수",
                    data:bycCnt,
                    backgroundColor:["rgba(0, 0, 255, 0.4)"]
                });
                years_all_chart.update();
            }
        })
    }
})