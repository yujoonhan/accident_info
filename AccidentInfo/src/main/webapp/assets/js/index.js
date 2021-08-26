$(function(){
    $.ajax({
        type:"get",
        url:"/api/accidentOldDth/today",
        success:function(r){
            console.log(r);
            let ctx1 = $("#old_chart");
            let old_chart = new Chart(ctx1, {
                type:"pie",
                options:{
                    responsive:false
                },
                data:{
                    labels:["경상", "중상", "사망"],
                    datasets:[
                        {
                            label:"경상/중상/사망",
                            data:[r.data.all_sl_dnv_cnt, r.data.all_se_dnv_cnt, r.data.all_dth_dnv_cnt],
                            backgroundColor:["rgba(0, 255, 0, 0.4)", "rgba(0, 0, 255, 0.4)", "rgba(255, 0, 0, 0.4)"]
                        }
                    ]
                }
            })
        }
    })

    $.ajax({
        type:"get",
        url:"/api/accidentChdDth/today",
        success:function(r){
            console.log(r);
            let ctx2 = $("#chd_chart");
            let chd_chart = new Chart(ctx2, {
                type:"pie",
                options:{
                    responsive:false
                },
                data:{
                    labels:["경상", "중상", "사망"],
                    datasets:[
                        {
                            label:"경상/중상/사망",
                            data:[r.data.all_sl_dnv_cnt, r.data.all_se_dnv_cnt, r.data.all_dth_dnv_cnt],
                            backgroundColor:["rgba(0, 255, 0, 0.4)", "rgba(0, 0, 255, 0.4)", "rgba(255, 0, 0, 0.4)"]
                        }
                    ]
                }
            })
        }
    })

    $.ajax({
        type:"get",
        url:"/api/accidentBycDth/today",
        success:function(r){
            console.log(r);
            let ctx3 = $("#byc_chart");
            let byc_chart = new Chart(ctx3, {
                type:"pie",
                options:{
                    responsive:false
                },
                data:{
                    labels:["경상", "중상", "사망"],
                    datasets:[
                        {
                            label:"경상/중상/사망",
                            data:[r.data.all_sl_dnv_cnt, r.data.all_se_dnv_cnt, r.data.all_dth_dnv_cnt],
                            backgroundColor:["rgba(0, 255, 0, 0.4)", "rgba(0, 0, 255, 0.4)", "rgba(255, 0, 0, 0.4)"]
                        }
                    ]
                }
            })
        }
    })

    $.ajax({
        type:"get",
        url:"/api/accidentAllcntR",
        success:function(r){
            console.log(r);
            let all_cnt = new Array();
            let sido_nm = new Array();
            for(let i=0; i<r.data.length; i++){
                let aCnt = r.data[i].all_cnt;
                let sido = r.data[i].sido_nm;
                all_cnt.push(aCnt);
                sido_nm.push(sido);
            }
            let ctx4 = $("#regionAll_chart");
            let regionAll_chart = new Chart(ctx4, {
                type:"bar",
                options:{
                    responsive:false
                },
                data:{
                    labels:sido_nm,
                    datasets:[
                        {
                            label:"지역별 전체 사고자 수",
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

})