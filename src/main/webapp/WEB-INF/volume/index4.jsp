<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.List,aviation.*;"%>

<!DOCTYPE html>
<html>

<head>
<title>首页</title>
<meta charset="UTF-8">
<script src="/aviation/assets/js/echarts.min.js"></script>
<script src="http://static.runoob.com/assets/jquery-validation-1.14.0/lib/jquery.js"></script>
<script src="http://static.runoob.com/assets/jquery-validation-1.14.0/dist/jquery.validate.min.js"></script>
<link rel="stylesheet" href="/aviation/assets/css/bootstrap.css">
</head>
<script>
	
</script>
<body>

	<div class="container">
		<!-- 为ECharts准备一个具备大小（宽高）的Dom -->
		<div id="main" style="width: 800px; height: 600px;margin-left:200px;margin-top:50px;" ></div>
		<script type="text/javascript">
			// 基于准备好的dom，初始化echarts实例
			var myChart = echarts.init(document.getElementById('main'));
			var datas = [];
			$.ajax({
				url : "data3",
				dateType:"json",
				async: false,
				success : function(e) {
					console.log(e)
					for(var i=0;i<e.length;i++){
						datas.push(e[i])
						console.log(datas)
					}
				}
			})
			// 指定图表的配置项和数据
			option = {
				title: {
			        text: '折线图堆叠'
			    },
			    tooltip: {
			        trigger: 'axis'
			    },
			    legend: {
			        data:['邮件营销','联盟广告','视频广告','直接访问','搜索引擎']
			    },
			    grid: {
			        left: '3%',
			        right: '4%',
			        bottom: '3%',
			        containLabel: true
			    },
			    toolbox: {
			        feature: {
			            saveAsImage: {}
			        }
			    },
			    xAxis: {
			        type: 'category',
			        boundaryGap: false,
			        data: ['周一','周二','周三','周四','周五','周六','周日']
			    },
			    yAxis: {
			        type: 'value'
			    },
			    series: [
			        {
			            name:'邮件营销',
			            type:'line',
			            stack: '总量',
			            data:[120, 132, 101, 134, 90, 230, 210]
			        },
			        {
			            name:'联盟广告',
			            type:'line',
			            stack: '总量',
			            data:[220, 182, 191, 234, 290, 330, 310]
			        },
			        {
			            name:'视频广告',
			            type:'line',
			            stack: '总量',
			            data:[150, 232, 201, 154, 190, 330, 410]
			        },
			        {
			            name:'直接访问',
			            type:'line',
			            stack: '总量',
			            data:[320, 332, 301, 334, 390, 330, 320]
			        },
			        {
			            name:'搜索引擎',
			            type:'line',
			            stack: '总量',
			            data:[820, 932, 901, 934, 1290, 1330, 1320]
			        }
			    ]
			};

			// Enable data zoom when user click bar.
			var zoomSize = 6;
			myChart.on('click', function(params) {
				console.log(dataAxis[Math.max(params.dataIndex - zoomSize / 2,
						0)]);
				myChart.dispatchAction({
					type : 'dataZoom',
					startValue : dataAxis[Math.max(params.dataIndex - zoomSize
							/ 2, 0)],
					endValue : dataAxis[Math.min(params.dataIndex + zoomSize
							/ 2, data.length - 1)]
				});
			});

			// 使用刚指定的配置项和数据显示图表。
			myChart.setOption(option);
		</script>
	</div>

</body>

</html>
