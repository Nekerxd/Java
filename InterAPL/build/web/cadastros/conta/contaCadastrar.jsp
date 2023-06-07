<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="iso-8859-1"%>
<jsp:include page="/header.jsp"/>
<jsp:include page="/menu.jsp"/>

<!--Page Heading-->
<div class="row">
    <div class="col-12">
        <div class="page-title-box">
            <h4 class="page-title float-left">Contas</h4>

            <ol class="breadcrumb float-right">
                <li class="breadcrumb-item">
                    <a href="${pageContext.request.contextPath}/">Home</a>
                </li>
                <li class="breadcrumb-item">
                    <a href="${pageContext.request.contextPath}/ContaListar">Contas</a></li>
                <li class="breadcrumb-item active">Cadastro</li>
            </ol>
            <div class="clearfix"></div>
        </div>
    </div>
</div>

                
<div class="card shadow mb-4">
    <div class="card-header py-3">
        <h6 class="m-0 font-weight-bold text-primary">Cadastro</h6>
    </div>
    <div class="card-body">
        <form name="cadastrarconta" action="ContaCadastrar" method="POST">
            <div class="form-row">
                
                <input type="hidden" class="form-control" id="idConta" name="idConta" value="${conta.idConta}" readonly="readonly">

                <div class="form-group col-md-9">
                    <label for="descConta" class="col-form-label">Título: </label>
                    <input type="text" class="form-control descricao" id="descConta" name="descConta" required value="${conta.descConta}" style="text-transform:uppercase">
                </div>
                    
                <div class="form-group col-md-5">
                    <label for="tipoConta" class="col-form-label">Tipo: </label>
                    <input type="text" class="form-control descricao" id="tipoConta" name="tipoConta" required value="${conta.tipoConta}" style="text-transform:uppercase">
                </div>
                
                <div class="form-group col-md-4">
                    <label for="saldoConta" class="col-form-label">Saldo: </label>
                    <input type="number" class="form-control descricao" id="saldoConta" name="saldoConta" required value="${conta.saldoConta}">
                </div>

                <div class="form-group col-md-5">
                    <label for="limiteConta" class="col-form-label">Limite: </label>
                    <input type="number" class="form-control descricao" id="limiteConta" name="limiteConta" required value="${conta.limiteConta}">
                </div>
                    
                <div class="form-group col-md-2">
                    <label for="idBanco" class="col-form-label">Banco</label>
                    <select class="form-control fct" name="idBanco" id="idBanco">
                        <option value="">Selecione</option>
                        <c:forEach var="banco" items="${bancos}">
                            <option value="${banco.idBanco}"
                                    ${conta.banco.idBanco == banco.idBanco ? "selected" : ""}>
                                    ${banco.nomeBanco}
                            </option>
                        </c:forEach>
                    </select>
                </div>
                    
                <div class="form-group col-md-2">
                    <label for="idusuario" class="col-form-label">Usuário</label>
                    <select class="form-control fct" name="idusuario" id="idusuario">
                        <option value="">Selecione</option>
                        <c:forEach var="usuario" items="${usuarios}">
                            <option value="${usuario.idUsuario}" 
                                    ${conta.usuario.idUsuario == usuario.idUsuario ? "selected" : ""}>
                                    ${usuario.nomeUsuario}
                            </option>
                        </c:forEach>
                    </select>
                </div>
            </div>
                
            <div class="form-group">        
                <button type="submit" class="btn btn-success navbar-btn" id="submit"><i class="fa fa-floppy-o" aria-hidden="true"></i> Salvar </button>
                <button type="reset" class="btn btn-danger navbar-btn" id="reset"><i class="fa fa-floppy-o" aria-hidden="true"></i> Limpar</button>
                <button class="btn btn-warning navbar-btn">
                    <a href="${pageContext.request.contextPath}/ContaListar" class="btn-warning" style="text-decoration: none">Cancelar</a>
                </button>  
            </div>
        </form>
    </div>
</div>
                
<%@include file="/footer.jsp" %>                           