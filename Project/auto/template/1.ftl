<html>
<head>
    <title>测试报告</title>
</head>
<body>
<h1>自动化测试报告-----${date?string("yyyy-MM-dd HH:mm:ss")}</h1>
<h2>本次共运行自动化case:${casesize}个，其中FAIL:${failcasesize}个</h2></br>

<div>
    <table width="100%"  border="1" cellspacing="0"  style="font-size:18px; font-family:'MS Serif', 'New York', serif;">


        <!-- 失败case列表-->
        <#if failedList?size gt 0>
            <tr   height="40" >
                <th  colspan="4" align="left" nowrap bgcolor="#66CC33"   scope="col"><div style="color:red; ">以下case执行失败：</div>
                </th>
            </tr>
            <tr bgcolor="#FFCC66" height="35">
                <th  width="8%"  nowrap scope="col">序号</th>
                <th  width="15%"    scope="col">test method</th>
                <th  width="45%"   nowrap scope="col">case title</th>
                <th    nowrap scope="col">测试结论</th>
            </tr>

            <#list failedList as case>
                <tr bgcolor="#FF0000">
                    <td align="center">${case_index+1}</td>
                    <td>${case.getMethod()}</td>
                    <td>${case.getAttribute("name")}</td>
                    <td>
                        <div style="color:red;">fail</div>
                    </td>
                </tr>
            </#list>
        </#if>

        <!--成功case列表-->
        <#if (passedList?size gt 0)>
            <tr   height="40">
                <th  colspan="4" align="left" nowrap bgcolor="#66CC33"   scope="col">以下case执行成功</th>
            </tr>
            <tr bgcolor="#FFCC66" height="35">
                <th  width="8%" nowrap  scope="col">序号</th>
                <th  width="15%"    scope="col">test method</th>
                <th  width="45%"   nowrap scope="col">case title</th>
                <th    nowrap scope="col">测试结论</th>
            </tr>

            <#list passedList as case>
                <tr >
                    <td align="center">${case_index+1}</td>
                    <td>${case.getMethod()}</td>
                    <td>${case.getAttribute("name")}</td>
                    <td>
                        PASS
                    </td>
                </tr>
            </#list>
        </#if>

    </table>
</div>
</body>
</html>