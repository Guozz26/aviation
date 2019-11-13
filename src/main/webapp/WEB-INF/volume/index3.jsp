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
				title : {
					text : '公司年度报表',
					subtext : ''
				},
				  xAxis: {
				        type: 'category',
				        data: ['1', '2', '3', '4', '5', '6', '7','8','9','10','11','12']
				    },
				    yAxis: {
				        type: 'value'
				    },
				    series: [{
				        data: [datas[0], datas[1], datas[2], datas[3], datas[4], datas[5], datas[6], datas[7], datas[8], datas[9], datas[10], datas[11], datas[12]],
				        
				        type: 'line'
				    }]
				    
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
