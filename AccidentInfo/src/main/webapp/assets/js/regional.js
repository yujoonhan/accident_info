$(function(){
    let ctx1 = $("#region_old_chart");
    let region_old_chart = new Chart(ctx1, {
        type:"bar",
        options:{
            responsive:false
        },
        data:{
            labels:null,
            datasets:[
                {
                    label:"지역별 노인 보행자 사고 수",
                    data:null,
                    backgroundColor:["rgba(255, 0, 0, 0.4)"]
                }
            ]
        }
    })
    let ctx2 = $("#region_chd_chart");
    let region_chd_chart = new Chart(ctx2, {
        type:"bar",
        options:{
            responsive:false
        },
        data:{
            labels:null,
            datasets:[
                {
                    label:"지역별 어린이 보행자 사고 수",
                    data:null,
                    backgroundColor:["rgba(0, 255, 0, 0.4)"]
                }
            ]
        }
    })
    let ctx3 = $("#region_byc_chart");
    let region_byc_chart = new Chart(ctx3, {
        type:"bar",
        options:{
            responsive:false
        },
        data:{
            labels:null,
            datasets:[
                {
                    label:"지역별 자전거 보행자 사고 수",
                    data:null,
                    backgroundColor:["rgba(0, 0, 255, 0.4)"]
                }
            ]
        }
    })
    let ctx4 = $("#region_all_chart");
    let region_all_chart = new Chart(ctx4, {
        type:"bar",
        options:{
            responsive:false
        },
        data:null
    })

    $("#year_select").change(function(){
        let date = $("#year_select").find("option:selected").val();
        getRegionalInfo(date);
    });

    getRegionalInfo("2020-01-01")

    function getRegionalInfo(date){
        $.ajax({
            type:"get",
            url:"/api/regionalCnt/"+date,
            success:function(r){
                console.log(r);
                console.log(date);
                $(".sido_Aarea").html("");
                for(let i=0; i<r.regionCnt.length; i++){
                    let tag =
                        '<div class="sido_box">'+
                            '<p class="sido_name">'+r.regionCnt[i].sido_nm+'</p>'+
                            '<p>'+
                                '<span>노인</span>'+
                                '<span style="margin-left:5px">'+r.regionCnt[i].old_cnt+'</span>'+
                            '</p>'+
                            '<p>'+
                                '<span>어린이</span>'+
                                '<span style="margin-left:5px">'+r.regionCnt[i].chd_cnt+'</span>'+
                            '</p>'+
                            '<p>'+
                                '<span>자전거</span>'+
                                '<span style="margin-left:5px">'+r.regionCnt[i].byc_cnt+'</span>'+
                            '</p>'+
                        "</div>";
                    $(".sido_Aarea").append(tag);
                }
                let regionalCnt = new Array();
                let oldCnt = new Array();
                let chdCnt = new Array();
                let bycCnt = new Array();
                for(let i=0; i<r.regionCnt.length; i++){
                    let sido = r.regionCnt[i].sido_nm;
                    let cntO = r.regionCnt[i].old_cnt;
                    let cntC = r.regionCnt[i].chd_cnt;
                    let cntB = r.regionCnt[i].byc_cnt;
                    regionalCnt.push(sido);
                    oldCnt.push(cntO);
                    chdCnt.push(cntC);
                    bycCnt.push(cntB);
                }

                region_old_chart.data.datasets = new Array(); // 데이터 셋 초기화
                region_old_chart.data.labels = regionalCnt; // 레이블 교체
                region_old_chart.data.datasets.push({
                    label:"연도별 노인 보행자 사고 수", 
                    data:oldCnt,
                    backgroundColor:["rgba(255, 0, 0, 0.4)"]
                });
                region_old_chart.update();

                region_chd_chart.data.datasets = new Array(); // 데이터 셋 초기화
                region_chd_chart.data.labels = regionalCnt; // 레이블 교체
                region_chd_chart.data.datasets.push({
                    label:"연도별 어린이 보행자 사고 수", 
                    data:chdCnt,
                    backgroundColor:["rgba(0, 255, 0, 0.4)"]
                });
                region_chd_chart.update();

                region_byc_chart.data.datasets = new Array(); // 데이터 셋 초기화
                region_byc_chart.data.labels = regionalCnt; // 레이블 교체
                region_byc_chart.data.datasets.push({
                    label:"연도별 자전거 보행자 사고 수", 
                    data:bycCnt,
                    backgroundColor:["rgba(0, 0, 255, 0.4)"]
                });
                region_byc_chart.update();

                region_all_chart.data.datasets = new Array(); // 데이터 셋 초기화
                region_all_chart.data.labels = regionalCnt; // 레이블 교체
                region_all_chart.data.datasets.push({
                    label:"연도별 노인 보행자 사고 수", 
                    data:oldCnt,
                    backgroundColor:["rgba(255, 0, 0, 0.4)"]
                });
                region_all_chart.data.datasets.push({
                    label:"연도별 어린이 보행자 사고 수", 
                    data:chdCnt,
                    backgroundColor:["rgba(0, 255, 0, 0.4)"]
                });
                region_all_chart.data.datasets.push({
                    label:"연도별 자전거 보행자 사고 수", 
                    data:bycCnt,
                    backgroundColor:["rgba(0, 0, 255, 0.4)"]
                });
                region_all_chart.update();
            }
        })
    }
    
})