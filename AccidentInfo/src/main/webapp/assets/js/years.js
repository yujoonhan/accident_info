$(function(){
    $.ajax({
        type:"get",
        url:"/api/yearCnt",
        success:function(r){
            console.log(r);
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

            let ctx4 = $("#years_all_chart");
            let years_all_chart = new Chart(ctx4, {
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