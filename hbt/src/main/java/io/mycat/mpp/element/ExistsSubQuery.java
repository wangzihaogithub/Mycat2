package io.mycat.mpp.element;

import com.alibaba.fastsql.sql.ast.SQLObject;
import io.mycat.mpp.DataContext;
import io.mycat.mpp.SqlValue;
import io.mycat.mpp.plan.DataAccessor;
import io.mycat.mpp.plan.QueryPlan;
import io.mycat.mpp.plan.RowType;
import io.mycat.mpp.runtime.Type;

public class ExistsSubQuery implements SqlValue {
    public ExistsSubQuery(boolean not, QueryPlan sqlExpr) {
        super();
    }

    @Override
    public Object getValue(RowType type, DataAccessor dataAccessor, DataContext context) {
        return null;
    }

    @Override
    public Type getType() {
        return null;
    }

    @Override
    public SQLObject toParseTree() {
        return null;
    }
}