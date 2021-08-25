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

    let ctx4 = $("#regionAll_chart");
    let regionAll_chart = new Chart(ctx4, {
        type:"bar",
        options:{
            responsive:false
        },
        data:{
            labels:["1", "2", "3", "4", "5"],
            datasets:[
                {
                    label:"asdf",
                    data:[10, 20, 40, 123, 12],
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
            labels:["1", "2", "3", "4", "5"],
            datasets:[
                {
                    label:"asdf",
                    data:[3200, 5600, 4400, 6200, 5500],
                    backgroundColor:["rgba(255, 0, 0, 0.4)"]
                    // "rgba(0, 255, 0, 0.4)", "rgba(0, 0, 255, 0.4)"
                },
                {
                    label:"asdf",
                    data:[1200, 2600, 1400, 1200, 1500],
                    backgroundColor:["rgba(0, 255, 0, 0.4)"]
                },
                {
                    label:"asdf",
                    data:[2200, 3600, 2400, 3200, 3500],
                    backgroundColor:["rgba(0, 0, 255, 0.4)"]
                }
            ]
        }
    })

})