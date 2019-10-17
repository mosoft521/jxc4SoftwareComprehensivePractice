package com.gmail.mosoft521.cp.jxc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SellExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SellExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andSellidIsNull() {
            addCriterion("sellID is null");
            return (Criteria) this;
        }

        public Criteria andSellidIsNotNull() {
            addCriterion("sellID is not null");
            return (Criteria) this;
        }

        public Criteria andSellidEqualTo(String value) {
            addCriterion("sellID =", value, "sellid");
            return (Criteria) this;
        }

        public Criteria andSellidNotEqualTo(String value) {
            addCriterion("sellID <>", value, "sellid");
            return (Criteria) this;
        }

        public Criteria andSellidGreaterThan(String value) {
            addCriterion("sellID >", value, "sellid");
            return (Criteria) this;
        }

        public Criteria andSellidGreaterThanOrEqualTo(String value) {
            addCriterion("sellID >=", value, "sellid");
            return (Criteria) this;
        }

        public Criteria andSellidLessThan(String value) {
            addCriterion("sellID <", value, "sellid");
            return (Criteria) this;
        }

        public Criteria andSellidLessThanOrEqualTo(String value) {
            addCriterion("sellID <=", value, "sellid");
            return (Criteria) this;
        }

        public Criteria andSellidLike(String value) {
            addCriterion("sellID like", value, "sellid");
            return (Criteria) this;
        }

        public Criteria andSellidNotLike(String value) {
            addCriterion("sellID not like", value, "sellid");
            return (Criteria) this;
        }

        public Criteria andSellidIn(List<String> values) {
            addCriterion("sellID in", values, "sellid");
            return (Criteria) this;
        }

        public Criteria andSellidNotIn(List<String> values) {
            addCriterion("sellID not in", values, "sellid");
            return (Criteria) this;
        }

        public Criteria andSellidBetween(String value1, String value2) {
            addCriterion("sellID between", value1, value2, "sellid");
            return (Criteria) this;
        }

        public Criteria andSellidNotBetween(String value1, String value2) {
            addCriterion("sellID not between", value1, value2, "sellid");
            return (Criteria) this;
        }

        public Criteria andPzsIsNull() {
            addCriterion("pzs is null");
            return (Criteria) this;
        }

        public Criteria andPzsIsNotNull() {
            addCriterion("pzs is not null");
            return (Criteria) this;
        }

        public Criteria andPzsEqualTo(Float value) {
            addCriterion("pzs =", value, "pzs");
            return (Criteria) this;
        }

        public Criteria andPzsNotEqualTo(Float value) {
            addCriterion("pzs <>", value, "pzs");
            return (Criteria) this;
        }

        public Criteria andPzsGreaterThan(Float value) {
            addCriterion("pzs >", value, "pzs");
            return (Criteria) this;
        }

        public Criteria andPzsGreaterThanOrEqualTo(Float value) {
            addCriterion("pzs >=", value, "pzs");
            return (Criteria) this;
        }

        public Criteria andPzsLessThan(Float value) {
            addCriterion("pzs <", value, "pzs");
            return (Criteria) this;
        }

        public Criteria andPzsLessThanOrEqualTo(Float value) {
            addCriterion("pzs <=", value, "pzs");
            return (Criteria) this;
        }

        public Criteria andPzsIn(List<Float> values) {
            addCriterion("pzs in", values, "pzs");
            return (Criteria) this;
        }

        public Criteria andPzsNotIn(List<Float> values) {
            addCriterion("pzs not in", values, "pzs");
            return (Criteria) this;
        }

        public Criteria andPzsBetween(Float value1, Float value2) {
            addCriterion("pzs between", value1, value2, "pzs");
            return (Criteria) this;
        }

        public Criteria andPzsNotBetween(Float value1, Float value2) {
            addCriterion("pzs not between", value1, value2, "pzs");
            return (Criteria) this;
        }

        public Criteria andJeIsNull() {
            addCriterion("je is null");
            return (Criteria) this;
        }

        public Criteria andJeIsNotNull() {
            addCriterion("je is not null");
            return (Criteria) this;
        }

        public Criteria andJeEqualTo(String value) {
            addCriterion("je =", value, "je");
            return (Criteria) this;
        }

        public Criteria andJeNotEqualTo(String value) {
            addCriterion("je <>", value, "je");
            return (Criteria) this;
        }

        public Criteria andJeGreaterThan(String value) {
            addCriterion("je >", value, "je");
            return (Criteria) this;
        }

        public Criteria andJeGreaterThanOrEqualTo(String value) {
            addCriterion("je >=", value, "je");
            return (Criteria) this;
        }

        public Criteria andJeLessThan(String value) {
            addCriterion("je <", value, "je");
            return (Criteria) this;
        }

        public Criteria andJeLessThanOrEqualTo(String value) {
            addCriterion("je <=", value, "je");
            return (Criteria) this;
        }

        public Criteria andJeLike(String value) {
            addCriterion("je like", value, "je");
            return (Criteria) this;
        }

        public Criteria andJeNotLike(String value) {
            addCriterion("je not like", value, "je");
            return (Criteria) this;
        }

        public Criteria andJeIn(List<String> values) {
            addCriterion("je in", values, "je");
            return (Criteria) this;
        }

        public Criteria andJeNotIn(List<String> values) {
            addCriterion("je not in", values, "je");
            return (Criteria) this;
        }

        public Criteria andJeBetween(String value1, String value2) {
            addCriterion("je between", value1, value2, "je");
            return (Criteria) this;
        }

        public Criteria andJeNotBetween(String value1, String value2) {
            addCriterion("je not between", value1, value2, "je");
            return (Criteria) this;
        }

        public Criteria andYsjlIsNull() {
            addCriterion("ysjl is null");
            return (Criteria) this;
        }

        public Criteria andYsjlIsNotNull() {
            addCriterion("ysjl is not null");
            return (Criteria) this;
        }

        public Criteria andYsjlEqualTo(String value) {
            addCriterion("ysjl =", value, "ysjl");
            return (Criteria) this;
        }

        public Criteria andYsjlNotEqualTo(String value) {
            addCriterion("ysjl <>", value, "ysjl");
            return (Criteria) this;
        }

        public Criteria andYsjlGreaterThan(String value) {
            addCriterion("ysjl >", value, "ysjl");
            return (Criteria) this;
        }

        public Criteria andYsjlGreaterThanOrEqualTo(String value) {
            addCriterion("ysjl >=", value, "ysjl");
            return (Criteria) this;
        }

        public Criteria andYsjlLessThan(String value) {
            addCriterion("ysjl <", value, "ysjl");
            return (Criteria) this;
        }

        public Criteria andYsjlLessThanOrEqualTo(String value) {
            addCriterion("ysjl <=", value, "ysjl");
            return (Criteria) this;
        }

        public Criteria andYsjlLike(String value) {
            addCriterion("ysjl like", value, "ysjl");
            return (Criteria) this;
        }

        public Criteria andYsjlNotLike(String value) {
            addCriterion("ysjl not like", value, "ysjl");
            return (Criteria) this;
        }

        public Criteria andYsjlIn(List<String> values) {
            addCriterion("ysjl in", values, "ysjl");
            return (Criteria) this;
        }

        public Criteria andYsjlNotIn(List<String> values) {
            addCriterion("ysjl not in", values, "ysjl");
            return (Criteria) this;
        }

        public Criteria andYsjlBetween(String value1, String value2) {
            addCriterion("ysjl between", value1, value2, "ysjl");
            return (Criteria) this;
        }

        public Criteria andYsjlNotBetween(String value1, String value2) {
            addCriterion("ysjl not between", value1, value2, "ysjl");
            return (Criteria) this;
        }

        public Criteria andKhnameIsNull() {
            addCriterion("khname is null");
            return (Criteria) this;
        }

        public Criteria andKhnameIsNotNull() {
            addCriterion("khname is not null");
            return (Criteria) this;
        }

        public Criteria andKhnameEqualTo(String value) {
            addCriterion("khname =", value, "khname");
            return (Criteria) this;
        }

        public Criteria andKhnameNotEqualTo(String value) {
            addCriterion("khname <>", value, "khname");
            return (Criteria) this;
        }

        public Criteria andKhnameGreaterThan(String value) {
            addCriterion("khname >", value, "khname");
            return (Criteria) this;
        }

        public Criteria andKhnameGreaterThanOrEqualTo(String value) {
            addCriterion("khname >=", value, "khname");
            return (Criteria) this;
        }

        public Criteria andKhnameLessThan(String value) {
            addCriterion("khname <", value, "khname");
            return (Criteria) this;
        }

        public Criteria andKhnameLessThanOrEqualTo(String value) {
            addCriterion("khname <=", value, "khname");
            return (Criteria) this;
        }

        public Criteria andKhnameLike(String value) {
            addCriterion("khname like", value, "khname");
            return (Criteria) this;
        }

        public Criteria andKhnameNotLike(String value) {
            addCriterion("khname not like", value, "khname");
            return (Criteria) this;
        }

        public Criteria andKhnameIn(List<String> values) {
            addCriterion("khname in", values, "khname");
            return (Criteria) this;
        }

        public Criteria andKhnameNotIn(List<String> values) {
            addCriterion("khname not in", values, "khname");
            return (Criteria) this;
        }

        public Criteria andKhnameBetween(String value1, String value2) {
            addCriterion("khname between", value1, value2, "khname");
            return (Criteria) this;
        }

        public Criteria andKhnameNotBetween(String value1, String value2) {
            addCriterion("khname not between", value1, value2, "khname");
            return (Criteria) this;
        }

        public Criteria andXsdateIsNull() {
            addCriterion("xsdate is null");
            return (Criteria) this;
        }

        public Criteria andXsdateIsNotNull() {
            addCriterion("xsdate is not null");
            return (Criteria) this;
        }

        public Criteria andXsdateEqualTo(Date value) {
            addCriterion("xsdate =", value, "xsdate");
            return (Criteria) this;
        }

        public Criteria andXsdateNotEqualTo(Date value) {
            addCriterion("xsdate <>", value, "xsdate");
            return (Criteria) this;
        }

        public Criteria andXsdateGreaterThan(Date value) {
            addCriterion("xsdate >", value, "xsdate");
            return (Criteria) this;
        }

        public Criteria andXsdateGreaterThanOrEqualTo(Date value) {
            addCriterion("xsdate >=", value, "xsdate");
            return (Criteria) this;
        }

        public Criteria andXsdateLessThan(Date value) {
            addCriterion("xsdate <", value, "xsdate");
            return (Criteria) this;
        }

        public Criteria andXsdateLessThanOrEqualTo(Date value) {
            addCriterion("xsdate <=", value, "xsdate");
            return (Criteria) this;
        }

        public Criteria andXsdateIn(List<Date> values) {
            addCriterion("xsdate in", values, "xsdate");
            return (Criteria) this;
        }

        public Criteria andXsdateNotIn(List<Date> values) {
            addCriterion("xsdate not in", values, "xsdate");
            return (Criteria) this;
        }

        public Criteria andXsdateBetween(Date value1, Date value2) {
            addCriterion("xsdate between", value1, value2, "xsdate");
            return (Criteria) this;
        }

        public Criteria andXsdateNotBetween(Date value1, Date value2) {
            addCriterion("xsdate not between", value1, value2, "xsdate");
            return (Criteria) this;
        }

        public Criteria andCzyIsNull() {
            addCriterion("czy is null");
            return (Criteria) this;
        }

        public Criteria andCzyIsNotNull() {
            addCriterion("czy is not null");
            return (Criteria) this;
        }

        public Criteria andCzyEqualTo(String value) {
            addCriterion("czy =", value, "czy");
            return (Criteria) this;
        }

        public Criteria andCzyNotEqualTo(String value) {
            addCriterion("czy <>", value, "czy");
            return (Criteria) this;
        }

        public Criteria andCzyGreaterThan(String value) {
            addCriterion("czy >", value, "czy");
            return (Criteria) this;
        }

        public Criteria andCzyGreaterThanOrEqualTo(String value) {
            addCriterion("czy >=", value, "czy");
            return (Criteria) this;
        }

        public Criteria andCzyLessThan(String value) {
            addCriterion("czy <", value, "czy");
            return (Criteria) this;
        }

        public Criteria andCzyLessThanOrEqualTo(String value) {
            addCriterion("czy <=", value, "czy");
            return (Criteria) this;
        }

        public Criteria andCzyLike(String value) {
            addCriterion("czy like", value, "czy");
            return (Criteria) this;
        }

        public Criteria andCzyNotLike(String value) {
            addCriterion("czy not like", value, "czy");
            return (Criteria) this;
        }

        public Criteria andCzyIn(List<String> values) {
            addCriterion("czy in", values, "czy");
            return (Criteria) this;
        }

        public Criteria andCzyNotIn(List<String> values) {
            addCriterion("czy not in", values, "czy");
            return (Criteria) this;
        }

        public Criteria andCzyBetween(String value1, String value2) {
            addCriterion("czy between", value1, value2, "czy");
            return (Criteria) this;
        }

        public Criteria andCzyNotBetween(String value1, String value2) {
            addCriterion("czy not between", value1, value2, "czy");
            return (Criteria) this;
        }

        public Criteria andJsrIsNull() {
            addCriterion("jsr is null");
            return (Criteria) this;
        }

        public Criteria andJsrIsNotNull() {
            addCriterion("jsr is not null");
            return (Criteria) this;
        }

        public Criteria andJsrEqualTo(String value) {
            addCriterion("jsr =", value, "jsr");
            return (Criteria) this;
        }

        public Criteria andJsrNotEqualTo(String value) {
            addCriterion("jsr <>", value, "jsr");
            return (Criteria) this;
        }

        public Criteria andJsrGreaterThan(String value) {
            addCriterion("jsr >", value, "jsr");
            return (Criteria) this;
        }

        public Criteria andJsrGreaterThanOrEqualTo(String value) {
            addCriterion("jsr >=", value, "jsr");
            return (Criteria) this;
        }

        public Criteria andJsrLessThan(String value) {
            addCriterion("jsr <", value, "jsr");
            return (Criteria) this;
        }

        public Criteria andJsrLessThanOrEqualTo(String value) {
            addCriterion("jsr <=", value, "jsr");
            return (Criteria) this;
        }

        public Criteria andJsrLike(String value) {
            addCriterion("jsr like", value, "jsr");
            return (Criteria) this;
        }

        public Criteria andJsrNotLike(String value) {
            addCriterion("jsr not like", value, "jsr");
            return (Criteria) this;
        }

        public Criteria andJsrIn(List<String> values) {
            addCriterion("jsr in", values, "jsr");
            return (Criteria) this;
        }

        public Criteria andJsrNotIn(List<String> values) {
            addCriterion("jsr not in", values, "jsr");
            return (Criteria) this;
        }

        public Criteria andJsrBetween(String value1, String value2) {
            addCriterion("jsr between", value1, value2, "jsr");
            return (Criteria) this;
        }

        public Criteria andJsrNotBetween(String value1, String value2) {
            addCriterion("jsr not between", value1, value2, "jsr");
            return (Criteria) this;
        }

        public Criteria andJsfsIsNull() {
            addCriterion("jsfs is null");
            return (Criteria) this;
        }

        public Criteria andJsfsIsNotNull() {
            addCriterion("jsfs is not null");
            return (Criteria) this;
        }

        public Criteria andJsfsEqualTo(String value) {
            addCriterion("jsfs =", value, "jsfs");
            return (Criteria) this;
        }

        public Criteria andJsfsNotEqualTo(String value) {
            addCriterion("jsfs <>", value, "jsfs");
            return (Criteria) this;
        }

        public Criteria andJsfsGreaterThan(String value) {
            addCriterion("jsfs >", value, "jsfs");
            return (Criteria) this;
        }

        public Criteria andJsfsGreaterThanOrEqualTo(String value) {
            addCriterion("jsfs >=", value, "jsfs");
            return (Criteria) this;
        }

        public Criteria andJsfsLessThan(String value) {
            addCriterion("jsfs <", value, "jsfs");
            return (Criteria) this;
        }

        public Criteria andJsfsLessThanOrEqualTo(String value) {
            addCriterion("jsfs <=", value, "jsfs");
            return (Criteria) this;
        }

        public Criteria andJsfsLike(String value) {
            addCriterion("jsfs like", value, "jsfs");
            return (Criteria) this;
        }

        public Criteria andJsfsNotLike(String value) {
            addCriterion("jsfs not like", value, "jsfs");
            return (Criteria) this;
        }

        public Criteria andJsfsIn(List<String> values) {
            addCriterion("jsfs in", values, "jsfs");
            return (Criteria) this;
        }

        public Criteria andJsfsNotIn(List<String> values) {
            addCriterion("jsfs not in", values, "jsfs");
            return (Criteria) this;
        }

        public Criteria andJsfsBetween(String value1, String value2) {
            addCriterion("jsfs between", value1, value2, "jsfs");
            return (Criteria) this;
        }

        public Criteria andJsfsNotBetween(String value1, String value2) {
            addCriterion("jsfs not between", value1, value2, "jsfs");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}