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
            let ctx5 = $("#yearsAll_chart");
            let yearsAll_chart = new Chart(ctx5, {
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
        url:"/api/jwalking",
        success:function(r){
            console.log(r);
            let all_cnt = new Array();
            let yearDt = new Array();
            for(let i=0; i<r.data.length; i++){
                let aCnt = r.data[i].all_cnt;
                let years = r.data[i].yearDt;
                all_cnt.push(aCnt);
                yearDt.push(years);
            }
            let ctx1 = $("#jwalking_year_chart");
            let jwalking_year_chart = new Chart(ctx1, {
                type:"line",
                options:{
                    responsive:false
                },
                data:{
                    labels:yearDt,
                    datasets:[
                        {
                            label:"연도별 무단횡단 사고자 수",
                            data:all_cnt,
                            backgroundColor:["rgba(255, 0, 255, 0.4)"]
                        }
                    ]
                }
            })
        }
    })

})