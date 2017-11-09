<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>个人博客后台管理</title>
    <%@include file="common/head.jspf" %>
    <style type="text/css">
        body {
            font-family: microsoft yahei, monospace;
        }
    </style>
    <script>
        /**
         * 打开选项卡
         * @param text  选项卡标题
         * @param url   请求打开路径
         * @param icon  选项卡图标
         */
        function openTab(text,url,icon) {
            //判断当前选项卡是否存在
            if($('#tabs').tabs('exists',text)){
                //如果存在 显示
                $("#tabs").tabs("select",text);
            }else{
                //如果不存在 则新建一个
                $("#tabs").tabs('add',{
                    title:text,
                    closable:true,      //是否允许选项卡摺叠。
                    iconCls:icon,    //显示图标
                    content:"<iframe frameborder=0 scrolling='auto' style='width:100%;height:100%' src='/admin/"+url+"'></iframe>"
                    //url 远程加载所打开的url
                })
            }
        }
    </script>
</head>
<%--body中创建layout会自定全屏--%>
<body class="easyui-layout">
<div region="north" style="height: 70px;font-size: larger;font-stretch: inherit">
    <table style="padding: 5px " width="100%">
        <tr>
            <td width="50%" valign="middle" align="left">
                <h2>个人博客系统</h2>
            </td>
            <td valign="bottom" align="right" width="50%">
                <span style="font-size: small; "> <strong>欢迎：</strong>admin</span>
            </td>
        </tr>
    </table>
</div>
<div region="west" style="width: 200px" title="导航菜单" split="true">
    <div class="easyui-accordion" data-options="fit:true,border:false">
        <div title="常用操作" data-options="selected:true,iconCls:'icon-item'" style="padding: 10px">
            <a href="javascript:openTab('写博客','writeBlog','icon-writeblog')" class="easyui-linkbutton"
               data-options="plain:true,iconCls:'icon-writeblog'" style="width: 150px">写博客</a>
            <a href="javascript:openTab('评论审核','commentReview','icon-review')" class="easyui-linkbutton"
               data-options="plain:true,iconCls:'icon-review'" style="width: 150px">评论审核</a>
        </div>
        <div title="博客管理" data-options="iconCls:'icon-bkgl'" style="padding:10px;">
            <a href="javascript:openTab('写博客','writeBlog','icon-writeblog')" class="easyui-linkbutton"
               data-options="plain:true,iconCls:'icon-writeblog'" style="width: 150px;">写博客</a>
            <a href="javascript:openTab('博客信息管理','blogManage','icon-bkgl')" class="easyui-linkbutton"
               data-options="plain:true,iconCls:'icon-bkgl'" style="width: 150px;">博客信息管理</a>
        </div>
        <div title="博客类别管理" data-options="iconCls:'icon-bklb'" style="padding:10px">
            <a href="javascript:openTab('博客类别信息管理','blogTypeManage','icon-bklb')" class="easyui-linkbutton"
               data-options="plain:true,iconCls:'icon-bklb'" style="width: 150px;">博客类别信息管理</a>
        </div>
        <div title="评论管理" data-options="iconCls:'icon-plgl'" style="padding:10px">
            <a href="javascript:openTab('评论审核','commentReview','icon-review')" class="easyui-linkbutton"
               data-options="plain:true,iconCls:'icon-review'" style="width: 150px">评论审核</a>
            <a href="javascript:openTab('评论信息管理','commentManage','icon-plgl')" class="easyui-linkbutton"
               data-options="plain:true,iconCls:'icon-plgl'" style="width: 150px;">评论信息管理</a>
        </div>
        <div title="个人信息管理" data-options="iconCls:'icon-grxx'" style="padding:10px">
            <a href="javascript:openTab('修改个人信息','modifyInfo','icon-grxxxg')" class="easyui-linkbutton"
               data-options="plain:true,iconCls:'icon-grxxxg'" style="width: 150px;">修改个人信息</a>
        </div>
        <div title="系统管理" data-options="iconCls:'icon-system'" style="padding:10px">
            <a href="javascript:openTab('友情链接管理','linkManage','icon-link')" class="easyui-linkbutton"
               data-options="plain:true,iconCls:'icon-link'" style="width: 150px">友情链接管理</a>
            <a href="#" class="easyui-linkbutton"
               data-options="plain:true,iconCls:'icon-modifyPassword'" style="width: 150px;">修改密码</a>
            <a href="#" class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-refresh'" style="width: 150px;">刷新系统缓存</a>
            <a href="#" class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-exit'"
               style="width: 150px;">安全退出</a>
        </div>
    </div>
</div>
<div id="tab" data-options="region:'center'">
    <div id="tabs" class="easyui-tabs" fit="true">
        <div title="首页" data-options="iconCls:'icon-home'" style="padding:20px;display:none;">
        </div>
    </div>
</div>
<div region="south" style="height: 25px;padding: 5px" align="center">
    Copyright © 2012-2017 中华人民共和国 版权所有
</div>
</body>
</html>