$(function(){
    $.ajax({
        type:"get",
        url:"/api/accidentAllcnt",
        success:function(r){
            console.log(r);
            let all_cnt = new Array();
            let yyearDt = new Array();
            for(let i=0; i<r.data.length; i++){
                let aCnt = r.data[i].all_cnt;
                let years = r.data[i].yyearDt;
                all_cnt.push(aCnt);
                yyearDt.push(years);
            }
            let ctx1 = $("#yearsAll_chart");
            let yearsAll_chart = new Chart(ctx1, {
                type:"line",
                options:{
                    responsive:false
                },
                data:{
                    labels:yyearDt,
                    datasets:[
                        {
                            label:"연도별 전체 사고자 수",
                            data:all_cnt,
                            backgroundColor:["rgba(255, 0, 255, 0.4)"]
                        }
                    ]
                }
            })
        }
    })

    $.ajax({
        type:"get",
        url:"/api/trafficSCnt",
        success:function(r){
            console.log(r);
            let y2016 = r.data.y2016;
            let y2017 = r.data.y2017;
            let y2018 = r.data.y2018;
            let y2019 = r.data.y2019;
            let y2020 = r.data.y2020;
            let ctx3 = $("#traffic_s_chart");
            let traffic_s_chart = new Chart(ctx3, {
                type:"line",
                options:{
                    responsive:false
                },
                data:{
                    labels:["2016", "2017", "2018", "2019", "2020"],
                    datasets:[
                        {
                            label:"연도별 소형차 교통량",
                            data:[y2016, y2017 ,y2018, y2019, y2020],
                            backgroundColor:["rgba(255, 0, 0, 0.4)"]
                        }
                    ]
                }
            })
        }
    })

    $.ajax({
        type:"get",
        url:"/api/trafficMCnt",
        success:function(r){
            console.log(r);
            let y2016 = r.data.y2016;
            let y2017 = r.data.y2017;
            let y2018 = r.data.y2018;
            let y2019 = r.data.y2019;
            let y2020 = r.data.y2020;
            let ctx2 = $("#traffic_m_chart");
            let traffic_m_chart = new Chart(ctx2, {
                type:"line",
                options:{
                    responsive:false
                },
                data:{
                    labels:["2016", "2017", "2018", "2019", "2020"],
                    datasets:[
                        {
                            label:"연도별 중형차 교통량",
                            data:[y2016, y2017 ,y2018, y2019, y2020],
                            backgroundColor:["rgba(255, 0, 255, 0.4)"]
                        }
                    ]
                }
            })
        }
    })

    $.ajax({
        type:"get",
        url:"/api/trafficLCnt",
        success:function(r){
            console.log(r);
            let y2016 = r.data.y2016;
            let y2017 = r.data.y2017;
            let y2018 = r.data.y2018;
            let y2019 = r.data.y2019;
            let y2020 = r.data.y2020;
            let ctx4 = $("#traffic_l_chart");
            let traffic_l_chart = new Chart(ctx4, {
                type:"line",
                options:{
                    responsive:false
                },
                data:{
                    labels:["2016", "2017", "2018", "2019", "2020"],
                    datasets:[
                        {
                            label:"연도별 대형차 교통량",
                            data:[y2016, y2017 ,y2018, y2019, y2020],
                            backgroundColor:["rgba(0, 255, 0, 0.4)"]
                        }
                    ]
                }
            })
        }
    })

    $.ajax({
        type:"get",
        url:"/api/trafficCar",
        success:function(r){
            console.log(r);
            let ctx5 = $("#traffic_car_chart");
                let traffic_car_chart = new Chart(ctx5, {
                    type:"pie",
                    options:{
                        responsive:false
                    },
                    data:{
                        labels:["소형차", "중형차", "대형차"],
                        datasets:[
                            {
                                label:"소형차/중형차/대형차",
                                data:[r.data.all_s_c,  r.data.all_m_c,  r.data.all_l_c],
                                backgroundColor:["rgba(0, 255, 0, 0.4)", "rgba(0, 0, 255, 0.4)", "rgba(255, 0, 0, 0.4)"]
                            }
                        ]
                    }
                })
        }
    })
})