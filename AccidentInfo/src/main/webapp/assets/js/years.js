$(function(){
    let ctx1 = $("#years_old_chart");
    let years_old_chart = new Chart(ctx1, {
        type:"line",
        options:{
            responsive:false
        },
        data:{
            labels:["2015", "2016", "2017", "2018", "2019", "2020"],
            datasets:[
                {
                    label:"연도별 노인 보행자 사고 수",
                    data:[3200, 5600, 4400, 6200, 5500, 2200],
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
            labels:["2015", "2016", "2017", "2018", "2019", "2020"],
            datasets:[
                {
                    label:"연도별 어린이 보행자 사고 수",
                    data:[3200, 5600, 4400, 6200, 5500, 2200],
                    backgroundColor:["rgba(255, 0, 0, 0.4)"]
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
            labels:["2015", "2016", "2017", "2018", "2019", "2020"],
            datasets:[
                {
                    label:"연도별 자전거 보행자 사고 수",
                    data:[3200, 5600, 4400, 6200, 5500, 2200],
                    backgroundColor:["rgba(255, 0, 0, 0.4)"]
                }
            ]
        }
    })
})