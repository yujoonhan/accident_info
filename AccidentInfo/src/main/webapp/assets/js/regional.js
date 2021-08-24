$(function(){
    $.ajax({
        type:"get",
        url:"/api/regionalOld",
        success:function(r){
            console.log(r);
            $(".sido_Oarea").html("");
            for(let i=0; i<r.regionList.length; i++){
                let tag =
                    '<div class="sido_box">'+
                        '<p class="sido_name">'+r.regionList[i].sido_nm+'</p>'+
                        '<p class="regionOld">'+
                            '<span>노인</span>'+
                            '<span class="regionOldCnt" style="margin-left:5px">'+r.regionList[i].region_cnt+'</span>'+
                        '</p>'+
                    "</div>";
                $(".sido_Oarea").append(tag);
            }
            let sidoOName = new Array();
            let Oldcnt = new Array();
            for(let i=0; i<r.regionList.length; i++){
                let sidoO = r.regionList[i].sido_nm;
                let cntO = r.regionList[i].region_cnt;
                sidoOName.push(sidoO);
                Oldcnt.push(cntO);
            }
            let ctx1 = $("#region_old_chart");
            let region_old_chart = new Chart(ctx1, {
                type:"bar",
                options:{
                    responsive:false
                },
                data:{
                    labels:sidoOName,
                    datasets:[
                        {
                            label:"지역별 노인 보행자 사고 수",
                            data:Oldcnt,
                            backgroundColor:["rgba(255, 0, 0, 0.4)"]
                        }
                    ]
                }
            })
        }
    })
    $.ajax({
        type:"get",
        url:"/api/regionalChd",
        success:function(r){
            console.log(r);
            $(".sido_Carea").html("");
            for(let i=0; i<r.regionCList.length; i++){
                let tag =
                    '<div class="sido_box">'+
                        '<p class="sido_name">'+r.regionCList[i].sido_nm+'</p>'+
                        '<p class="regionChd">'+
                            '<span>어린이</span>'+
                            '<span class="regionChdCnt" style="margin-left:5px">'+r.regionCList[i].region_cnt+'</span>'+
                        '</p>'+
                    "</div>";
                $(".sido_Carea").append(tag);
            }
            let sidoCName = new Array();
            let Chdcnt = new Array();
            for(let i=0; i<r.regionCList.length; i++){
                let sidoC = r.regionCList[i].sido_nm;
                let cntC = r.regionCList[i].region_cnt;
                sidoCName.push(sidoC);
                Chdcnt.push(cntC);
            }
            let ctx2 = $("#region_chd_chart");
            let region_chd_chart = new Chart(ctx2, {
                type:"bar",
                options:{
                    responsive:false
                },
                data:{
                    labels:sidoCName,
                    datasets:[
                        {
                            label:"지역별 어린이 보행자 사고 수",
                            data:Chdcnt,
                            backgroundColor:["rgba(0, 255, 0, 0.4)"]
                        }
                    ]
                }
            })
        }
    })
    $.ajax({
        type:"get",
        url:"/api/regionalByc",
        success:function(r){
            console.log(r);
            $(".sido_Barea").html("");
            for(let i=0; i<r.regionBList.length; i++){
                let tag =
                    '<div class="sido_box">'+
                        '<p class="sido_name">'+r.regionBList[i].sido_nm+'</p>'+
                        '<p class="regionByc">'+
                            '<span>자전거</span>'+
                            '<span class="regionBycCnt" style="margin-left:5px">'+r.regionBList[i].region_cnt+'</span>'+
                        '</p>'+
                    "</div>";
                $(".sido_Barea").append(tag);
            }
            let sidoBName = new Array();
            let Byccnt = new Array();
            for(let i=0; i<r.regionBList.length; i++){
                let sidoB = r.regionBList[i].sido_nm;
                let cntB = r.regionBList[i].region_cnt;
                sidoBName.push(sidoB);
                Byccnt.push(cntB);
            }
            let ctx3 = $("#region_byc_chart");
            let region_byc_chart = new Chart(ctx3, {
                type:"bar",
                options:{
                    responsive:false
                },
                data:{
                    labels:sidoBName,
                    datasets:[
                        {
                            label:"지역별 자전거 보행자 사고 수",
                            data:Byccnt,
                            backgroundColor:["rgba(0, 0, 255, 0.4)"]
                        }
                    ]
                }
            })
        }
    })
    
    let ctx4 = $("#region_all_chart");
    let region_byc_chart = new Chart(ctx4, {
        type:"bar",
        options:{
            responsive:false
        },
        data:{
            labels:["서울", "대구"],
            datasets:[
                {
                    label:"지역별 노인 보행자 사고 수",
                    data:[3000, 2000],
                    backgroundColor:["rgba(255, 0, 0, 0.4)"]
                },
                {
                    label:"지역별 어린이 보행자 사고 수",
                    data:[1000, 200],
                    backgroundColor:["rgba(0, 255, 0, 0.4)"]
                },
                {
                    label:"지역별 자전거 보행자 사고 수",
                    data:[2500, 1500],
                    backgroundColor:["rgba(0, 0, 255, 0.4)"]
                }
            ]
        }
    })
    
    
})