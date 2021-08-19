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
})