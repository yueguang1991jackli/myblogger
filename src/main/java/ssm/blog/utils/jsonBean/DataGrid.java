package ssm.blog.utils.jsonBean;

import java.util.List;

//{"total":28,"rows":[
//        {"id","typeName","orderNum"},
//        ]
// }
public class DataGrid<T> {

    private long total;
    private List<T> rows;

    public DataGrid() {
    }

    public DataGrid(long total, List<T> rows) {
        this.total = total;
        this.rows = rows;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}
