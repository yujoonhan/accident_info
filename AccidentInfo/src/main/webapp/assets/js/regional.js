$(function(){
    let ctx1 = $("#region_old_chart");
    let region_old_chart = new Chart(ctx1, {
        type:"bar",
        options:{
            responsive:false
        },
        data:{
            labels:["서울", "부산", "대구", "인천", "광주", "대전", "울산", "세종", "경기",
                "강원", "충북", "충남", "전북", "전남", "경북", "경남", "제주"],
            datasets:[
                {
                    label:"지역별 노인 보행자 사고 수",
                    data:[10, 20, 40, 123, 12, 214, 345, 123, 5, 23, 34, 2, 23, 9, 89, 11, 1],
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
            labels:["서울", "부산", "대구", "인천", "광주", "대전", "울산", "세종", "경기",
                "강원", "충북", "충남", "전북", "전남", "경북", "경남", "제주"],
            datasets:[
                {
                    label:"지역별 어린이 보행자 사고 수",
                    data:[10, 20, 40, 123, 12, 214, 345, 123, 5, 23, 34, 2, 23, 9, 89, 11, 1],
                    backgroundColor:["rgba(255, 0, 0, 0.4)"]
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
            labels:["서울", "부산", "대구", "인천", "광주", "대전", "울산", "세종", "경기",
                "강원", "충북", "충남", "전북", "전남", "경북", "경남", "제주"],
            datasets:[
                {
                    label:"지역별 자전거 보행자 사고 수",
                    data:[10, 20, 40, 123, 12, 214, 345, 123, 5, 23, 34, 2, 23, 9, 89, 11, 1],
                    backgroundColor:["rgba(255, 0, 0, 0.4)"]
                }
            ]
        }
    })
})