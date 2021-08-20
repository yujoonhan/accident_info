$(function(){
    let ctx1 = $("#old_chart");
    let old_chart = new Chart(ctx1, {
        type:"pie",
        options:{
            responsive:false
        },
        data:{
            labels:["사망", "중상", "경상"],
            datasets:[
                {
                    label:"사망/중상/경상",
                    data:[10, 20, 40],
                    backgroundColor:["rgba(255, 0, 0, 0.4)", "rgba(0, 255, 0, 0.4)", "rgba(0, 0, 255, 0.4)"]
                }
            ]
        }
    })

    let ctx2 = $("#chd_chart");
    let chd_chart = new Chart(ctx2, {
        type:"pie",
        options:{
            responsive:false
        },
        data:{
            labels:["사망", "중상", "경상"],
            datasets:[
                {
                    label:"사망/중상/경상",
                    data:[10, 20, 40],
                    backgroundColor:["rgba(255, 0, 0, 0.4)", "rgba(0, 255, 0, 0.4)", "rgba(0, 0, 255, 0.4)"]
                }
            ]
        }
    })

    let ctx3 = $("#byc_chart");
    let byc_chart = new Chart(ctx3, {
        type:"pie",
        options:{
            responsive:false
        },
        data:{
            labels:["사망", "중상", "경상"],
            datasets:[
                {
                    label:"사망/중상/경상",
                    data:[10, 20, 40],
                    backgroundColor:["rgba(255, 0, 0, 0.4)", "rgba(0, 255, 0, 0.4)", "rgba(0, 0, 255, 0.4)"]
                }
            ]
        }
    })

    let ctx4 = $("#regionAll_chart");
    let regionAll_chart = new Chart(ctx4, {
        type:"bar",
        options:{
            responsive:false
        },
        data:{
            labels:["서울", "부산", "대구", "인천", "광주", "대전", "울산", "세종", "경기",
                "강원", "충북", "충남", "전북", "전남", "경북", "경남", "제주"],
            datasets:[
                {
                    label:"지역별 사상자 수 총합",
                    data:[10, 20, 40, 123, 12, 214, 345, 123, 5, 23, 34, 2, 23, 9, 89, 11, 1],
                    backgroundColor:["rgba(255, 0, 0, 0.4)"]
                }
            ]
        }
    })

    let ctx5 = $("#yearsAll_chart");
    let yearsAll_chart = new Chart(ctx5, {
        type:"line",
        options:{
            responsive:false
        },
        data:{
            labels:["2015", "2016", "2017", "2018", "2019", "2020"],
            datasets:[
                {
                    label:"연도별 노인 사상자 수 총합",
                    data:[3200, 5600, 4400, 6200, 5500, 2200],
                    backgroundColor:["rgba(255, 0, 0, 0.4)"]
                    // "rgba(0, 255, 0, 0.4)", "rgba(0, 0, 255, 0.4)"
                },
                {
                    label:"연도별 어린이 사상자 수 총합",
                    data:[1200, 2600, 1400, 1200, 1500, 600],
                    backgroundColor:["rgba(0, 255, 0, 0.4)"]
                },
                {
                    label:"연도별 자전거 사상자 수 총합",
                    data:[2200, 3600, 2400, 3200, 3500, 1500],
                    backgroundColor:["rgba(0, 0, 255, 0.4)"]
                }
            ]
        }
    })
})