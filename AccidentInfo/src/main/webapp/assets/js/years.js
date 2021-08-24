$(function(){
    $.ajax({
        type:"get",
        url:"/api/yearsOld",
        success:function(r){
            console.log(r);
            $(".year_Oarea").html("");
            for(let i=0; i<r.yearOList.length; i++){
                let tag =
                    '<div class="year_box">'+
                        '<p class="year_info">'+
                            '<span>노인</span>'+
                            '<span class="YearDate" style="margin-left:5px">'+r.yearOList[i].yyearDt+'</span>'+
                            '<span class="yearCnt" style="margin-left:5px">'+r.yearOList[i].years_cnt+'</span>'+
                        '</p>'+
                    "</div>";
                $(".year_Oarea").append(tag);
            }
            let yearsDt = new Array();
            let oldCnt = new Array();
            for(let i=0; i<r.yearOList.length; i++){
                let years = r.yearOList[i].yyearDt;
                let cntO = r.yearOList[i].years_cnt;
                yearsDt.push(years);
                oldCnt.push(cntO);
            }
            let ctx1 = $("#years_old_chart");
            let years_old_chart = new Chart(ctx1, {
                type:"line",
                options:{
                    responsive:false
                },
                data:{
                    labels:yearsDt,
                    datasets:[
                        {
                            label:"연도별 노인 보행자 사고 수",
                            data:oldCnt,
                            backgroundColor:["rgba(255, 0, 0, 0.4)"]
                        }
                    ]
                }
            })
        }
    })

    $.ajax({
        type:"get",
        url:"/api/yearsChd",
        success:function(r){
            console.log(r);
            $(".year_Carea").html("");
            for(let i=0; i<r.yearCList.length; i++){
                let tag =
                    '<div class="year_box">'+
                        '<p class="year_info">'+
                            '<span>어린이</span>'+
                            '<span class="YearDate" style="margin-left:5px">'+r.yearCList[i].yyearDt+'</span>'+
                            '<span class="yearCnt" style="margin-left:5px">'+r.yearCList[i].years_cnt+'</span>'+
                        '</p>'+
                    "</div>";
                $(".year_Carea").append(tag);
            }
            let yearsDt = new Array();
            let chdCnt = new Array();
            for(let i=0; i<r.yearCList.length; i++){
                let years = r.yearCList[i].yyearDt;
                let cntC = r.yearCList[i].years_cnt;
                yearsDt.push(years);
                chdCnt.push(cntC);
            }
            let ctx2 = $("#years_chd_chart");
            let years_chd_chart = new Chart(ctx2, {
                type:"line",
                options:{
                    responsive:false
                },
                data:{
                    labels:yearsDt,
                    datasets:[
                        {
                            label:"연도별 어린이 보행자 사고 수",
                            data:chdCnt,
                            backgroundColor:["rgba(0, 255, 0, 0.4)"]
                        }
                    ]
                }
            })
        }
    })
    
    $.ajax({
        type:"get",
        url:"/api/yearsByc",
        success:function(r){
            console.log(r);
            $(".year_Barea").html("");
            for(let i=0; i<r.yearBList.length; i++){
                let tag =
                    '<div class="year_box">'+
                        '<p class="year_info">'+
                            '<span>자전거</span>'+
                            '<span class="YearDate" style="margin-left:5px">'+r.yearBList[i].yyearDt+'</span>'+
                            '<span class="yearCnt" style="margin-left:5px">'+r.yearBList[i].years_cnt+'</span>'+
                        '</p>'+
                    "</div>";
                $(".year_Barea").append(tag);
            }
            let yearsDt = new Array();
            let bycCnt = new Array();
            for(let i=0; i<r.yearBList.length; i++){
                let years = r.yearBList[i].yyearDt;
                let cntB = r.yearBList[i].years_cnt;
                yearsDt.push(years);
                bycCnt.push(cntB);
            }
            let ctx3 = $("#years_byc_chart");
            let years_byc_chart = new Chart(ctx3, {
                type:"line",
                options:{
                    responsive:false
                },
                data:{
                    labels:yearsDt,
                    datasets:[
                        {
                            label:"연도별 자전거 보행자 사고 수",
                            data:bycCnt,
                            backgroundColor:["rgba(0, 0, 255, 0.4)"]
                        }
                    ]
                }
            })
        }
    })

    $.ajax({
        type:"get",
        url:"/api/yearCnt",
        success:function(r){
            console.log(r);
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
            let ctx4 = $("#years_all_chart");
            let years_byc_chart = new Chart(ctx4, {
                type:"line",
                options:{
                    responsive:false
                },
                data:{
                    labels:yearsDt,
                    datasets:[
                        {
                            label:"연도별 노인 보행자 사고 수",
                            data:oldCnt,
                            backgroundColor:["rgba(255, 0, 0, 0.4)"]
                        },
                        {
                            label:"연도별 어린이 보행자 사고 수",
                            data:chdCnt,
                            backgroundColor:["rgba(0, 255, 0, 0.4)"]
                        },
                        {
                            label:"연도별 자전거 보행자 사고 수",
                            data:bycCnt,
                            backgroundColor:["rgba(0, 0, 255, 0.4)"]
                        }
                    ]
                }
            })
        }
    })
    
})