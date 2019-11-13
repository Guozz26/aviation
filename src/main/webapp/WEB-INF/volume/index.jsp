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

			// 指定图表的配置项和数据
			var dataAxis = [];
			var data = [];
			$.ajax({
				url : "data",
				dateType:"json",
				async: false,
				success : function(e) {
					console.log(e)
					for(var i=0;i<e.length;i++){
						dataAxis.push(e[i].pointCity)
						data.push(e[i].moneyBodyPrice)
						console.log(data)
						console.log(dataAxis)
					}
				}
			})
			
			

			var yMax = 1000;
			var dataShadow = [];

			for (var i = 0; i < data.length; i++) {
				dataShadow.push(yMax);
			}

			option = {
				title : {
					text : '各营业点月收入',
					subtext : ''
				},
				xAxis : {
					data : dataAxis,
					axisLabel : {
						inside : true,
						textStyle : {
							color : '#fff'
						}
					},
					axisTick : {
						show : false
					},
					axisLine : {
						show : false
					},
					z : 10
				},
				yAxis : {
					axisLine : {
						show : false
					},
					axisTick : {
						show : false
					},
					axisLabel : {
						textStyle : {
							color : '#999'
						}
					}
				},
				dataZoom : [ {
					type : 'inside'
				} ],
				series : [
						{ // For shadow
							type : 'bar',
							itemStyle : {
								normal : {
									color : 'rgba(0,0,0,0.05)'
								}
							},
							barGap : '-100%',
							barCategoryGap : '40%',
							data : dataShadow,
							animation : false
						},
						{
							type : 'bar',
							itemStyle : {
								normal : {
									color : new echarts.graphic.LinearGradient(
											0, 0, 0, 1, [ {
												offset : 0,
												color : '#83bff6'
											}, {
												offset : 0.5,
												color : '#188df0'
											}, {
												offset : 1,
												color : '#188df0'
											} ])
								},
								emphasis : {
									color : new echarts.graphic.LinearGradient(
											0, 0, 0, 1, [ {
												offset : 0,
												color : '#2378f7'
											}, {
												offset : 0.7,
												color : '#2378f7'
											}, {
												offset : 1,
												color : '#83bff6'
											} ])
								}
							},
							data : data
						} ]
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
