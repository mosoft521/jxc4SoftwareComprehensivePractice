package com.gmail.mosoft521.cp.jxc.entity;

import java.util.ArrayList;
import java.util.List;

public class KucunExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KucunExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSpnameIsNull() {
            addCriterion("spname is null");
            return (Criteria) this;
        }

        public Criteria andSpnameIsNotNull() {
            addCriterion("spname is not null");
            return (Criteria) this;
        }

        public Criteria andSpnameEqualTo(String value) {
            addCriterion("spname =", value, "spname");
            return (Criteria) this;
        }

        public Criteria andSpnameNotEqualTo(String value) {
            addCriterion("spname <>", value, "spname");
            return (Criteria) this;
        }

        public Criteria andSpnameGreaterThan(String value) {
            addCriterion("spname >", value, "spname");
            return (Criteria) this;
        }

        public Criteria andSpnameGreaterThanOrEqualTo(String value) {
            addCriterion("spname >=", value, "spname");
            return (Criteria) this;
        }

        public Criteria andSpnameLessThan(String value) {
            addCriterion("spname <", value, "spname");
            return (Criteria) this;
        }

        public Criteria andSpnameLessThanOrEqualTo(String value) {
            addCriterion("spname <=", value, "spname");
            return (Criteria) this;
        }

        public Criteria andSpnameLike(String value) {
            addCriterion("spname like", value, "spname");
            return (Criteria) this;
        }

        public Criteria andSpnameNotLike(String value) {
            addCriterion("spname not like", value, "spname");
            return (Criteria) this;
        }

        public Criteria andSpnameIn(List<String> values) {
            addCriterion("spname in", values, "spname");
            return (Criteria) this;
        }

        public Criteria andSpnameNotIn(List<String> values) {
            addCriterion("spname not in", values, "spname");
            return (Criteria) this;
        }

        public Criteria andSpnameBetween(String value1, String value2) {
            addCriterion("spname between", value1, value2, "spname");
            return (Criteria) this;
        }

        public Criteria andSpnameNotBetween(String value1, String value2) {
            addCriterion("spname not between", value1, value2, "spname");
            return (Criteria) this;
        }

        public Criteria andJcIsNull() {
            addCriterion("jc is null");
            return (Criteria) this;
        }

        public Criteria andJcIsNotNull() {
            addCriterion("jc is not null");
            return (Criteria) this;
        }

        public Criteria andJcEqualTo(String value) {
            addCriterion("jc =", value, "jc");
            return (Criteria) this;
        }

        public Criteria andJcNotEqualTo(String value) {
            addCriterion("jc <>", value, "jc");
            return (Criteria) this;
        }

        public Criteria andJcGreaterThan(String value) {
            addCriterion("jc >", value, "jc");
            return (Criteria) this;
        }

        public Criteria andJcGreaterThanOrEqualTo(String value) {
            addCriterion("jc >=", value, "jc");
            return (Criteria) this;
        }

        public Criteria andJcLessThan(String value) {
            addCriterion("jc <", value, "jc");
            return (Criteria) this;
        }

        public Criteria andJcLessThanOrEqualTo(String value) {
            addCriterion("jc <=", value, "jc");
            return (Criteria) this;
        }

        public Criteria andJcLike(String value) {
            addCriterion("jc like", value, "jc");
            return (Criteria) this;
        }

        public Criteria andJcNotLike(String value) {
            addCriterion("jc not like", value, "jc");
            return (Criteria) this;
        }

        public Criteria andJcIn(List<String> values) {
            addCriterion("jc in", values, "jc");
            return (Criteria) this;
        }

        public Criteria andJcNotIn(List<String> values) {
            addCriterion("jc not in", values, "jc");
            return (Criteria) this;
        }

        public Criteria andJcBetween(String value1, String value2) {
            addCriterion("jc between", value1, value2, "jc");
            return (Criteria) this;
        }

        public Criteria andJcNotBetween(String value1, String value2) {
            addCriterion("jc not between", value1, value2, "jc");
            return (Criteria) this;
        }

        public Criteria andGgIsNull() {
            addCriterion("gg is null");
            return (Criteria) this;
        }

        public Criteria andGgIsNotNull() {
            addCriterion("gg is not null");
            return (Criteria) this;
        }

        public Criteria andGgEqualTo(String value) {
            addCriterion("gg =", value, "gg");
            return (Criteria) this;
        }

        public Criteria andGgNotEqualTo(String value) {
            addCriterion("gg <>", value, "gg");
            return (Criteria) this;
        }

        public Criteria andGgGreaterThan(String value) {
            addCriterion("gg >", value, "gg");
            return (Criteria) this;
        }

        public Criteria andGgGreaterThanOrEqualTo(String value) {
            addCriterion("gg >=", value, "gg");
            return (Criteria) this;
        }

        public Criteria andGgLessThan(String value) {
            addCriterion("gg <", value, "gg");
            return (Criteria) this;
        }

        public Criteria andGgLessThanOrEqualTo(String value) {
            addCriterion("gg <=", value, "gg");
            return (Criteria) this;
        }

        public Criteria andGgLike(String value) {
            addCriterion("gg like", value, "gg");
            return (Criteria) this;
        }

        public Criteria andGgNotLike(String value) {
            addCriterion("gg not like", value, "gg");
            return (Criteria) this;
        }

        public Criteria andGgIn(List<String> values) {
            addCriterion("gg in", values, "gg");
            return (Criteria) this;
        }

        public Criteria andGgNotIn(List<String> values) {
            addCriterion("gg not in", values, "gg");
            return (Criteria) this;
        }

        public Criteria andGgBetween(String value1, String value2) {
            addCriterion("gg between", value1, value2, "gg");
            return (Criteria) this;
        }

        public Criteria andGgNotBetween(String value1, String value2) {
            addCriterion("gg not between", value1, value2, "gg");
            return (Criteria) this;
        }

        public Criteria andBzIsNull() {
            addCriterion("bz is null");
            return (Criteria) this;
        }

        public Criteria andBzIsNotNull() {
            addCriterion("bz is not null");
            return (Criteria) this;
        }

        public Criteria andBzEqualTo(String value) {
            addCriterion("bz =", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotEqualTo(String value) {
            addCriterion("bz <>", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThan(String value) {
            addCriterion("bz >", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThanOrEqualTo(String value) {
            addCriterion("bz >=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThan(String value) {
            addCriterion("bz <", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThanOrEqualTo(String value) {
            addCriterion("bz <=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLike(String value) {
            addCriterion("bz like", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotLike(String value) {
            addCriterion("bz not like", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzIn(List<String> values) {
            addCriterion("bz in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotIn(List<String> values) {
            addCriterion("bz not in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzBetween(String value1, String value2) {
            addCriterion("bz between", value1, value2, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotBetween(String value1, String value2) {
            addCriterion("bz not between", value1, value2, "bz");
            return (Criteria) this;
        }

        public Criteria andDwIsNull() {
            addCriterion("dw is null");
            return (Criteria) this;
        }

        public Criteria andDwIsNotNull() {
            addCriterion("dw is not null");
            return (Criteria) this;
        }

        public Criteria andDwEqualTo(String value) {
            addCriterion("dw =", value, "dw");
            return (Criteria) this;
        }

        public Criteria andDwNotEqualTo(String value) {
            addCriterion("dw <>", value, "dw");
            return (Criteria) this;
        }

        public Criteria andDwGreaterThan(String value) {
            addCriterion("dw >", value, "dw");
            return (Criteria) this;
        }

        public Criteria andDwGreaterThanOrEqualTo(String value) {
            addCriterion("dw >=", value, "dw");
            return (Criteria) this;
        }

        public Criteria andDwLessThan(String value) {
            addCriterion("dw <", value, "dw");
            return (Criteria) this;
        }

        public Criteria andDwLessThanOrEqualTo(String value) {
            addCriterion("dw <=", value, "dw");
            return (Criteria) this;
        }

        public Criteria andDwLike(String value) {
            addCriterion("dw like", value, "dw");
            return (Criteria) this;
        }

        public Criteria andDwNotLike(String value) {
            addCriterion("dw not like", value, "dw");
            return (Criteria) this;
        }

        public Criteria andDwIn(List<String> values) {
            addCriterion("dw in", values, "dw");
            return (Criteria) this;
        }

        public Criteria andDwNotIn(List<String> values) {
            addCriterion("dw not in", values, "dw");
            return (Criteria) this;
        }

        public Criteria andDwBetween(String value1, String value2) {
            addCriterion("dw between", value1, value2, "dw");
            return (Criteria) this;
        }

        public Criteria andDwNotBetween(String value1, String value2) {
            addCriterion("dw not between", value1, value2, "dw");
            return (Criteria) this;
        }

        public Criteria andDjIsNull() {
            addCriterion("dj is null");
            return (Criteria) this;
        }

        public Criteria andDjIsNotNull() {
            addCriterion("dj is not null");
            return (Criteria) this;
        }

        public Criteria andDjEqualTo(Float value) {
            addCriterion("dj =", value, "dj");
            return (Criteria) this;
        }

        public Criteria andDjNotEqualTo(Float value) {
            addCriterion("dj <>", value, "dj");
            return (Criteria) this;
        }

        public Criteria andDjGreaterThan(Float value) {
            addCriterion("dj >", value, "dj");
            return (Criteria) this;
        }

        public Criteria andDjGreaterThanOrEqualTo(Float value) {
            addCriterion("dj >=", value, "dj");
            return (Criteria) this;
        }

        public Criteria andDjLessThan(Float value) {
            addCriterion("dj <", value, "dj");
            return (Criteria) this;
        }

        public Criteria andDjLessThanOrEqualTo(Float value) {
            addCriterion("dj <=", value, "dj");
            return (Criteria) this;
        }

        public Criteria andDjIn(List<Float> values) {
            addCriterion("dj in", values, "dj");
            return (Criteria) this;
        }

        public Criteria andDjNotIn(List<Float> values) {
            addCriterion("dj not in", values, "dj");
            return (Criteria) this;
        }

        public Criteria andDjBetween(Float value1, Float value2) {
            addCriterion("dj between", value1, value2, "dj");
            return (Criteria) this;
        }

        public Criteria andDjNotBetween(Float value1, Float value2) {
            addCriterion("dj not between", value1, value2, "dj");
            return (Criteria) this;
        }

        public Criteria andKcslIsNull() {
            addCriterion("kcsl is null");
            return (Criteria) this;
        }

        public Criteria andKcslIsNotNull() {
            addCriterion("kcsl is not null");
            return (Criteria) this;
        }

        public Criteria andKcslEqualTo(Float value) {
            addCriterion("kcsl =", value, "kcsl");
            return (Criteria) this;
        }

        public Criteria andKcslNotEqualTo(Float value) {
            addCriterion("kcsl <>", value, "kcsl");
            return (Criteria) this;
        }

        public Criteria andKcslGreaterThan(Float value) {
            addCriterion("kcsl >", value, "kcsl");
            return (Criteria) this;
        }

        public Criteria andKcslGreaterThanOrEqualTo(Float value) {
            addCriterion("kcsl >=", value, "kcsl");
            return (Criteria) this;
        }

        public Criteria andKcslLessThan(Float value) {
            addCriterion("kcsl <", value, "kcsl");
            return (Criteria) this;
        }

        public Criteria andKcslLessThanOrEqualTo(Float value) {
            addCriterion("kcsl <=", value, "kcsl");
            return (Criteria) this;
        }

        public Criteria andKcslIn(List<Float> values) {
            addCriterion("kcsl in", values, "kcsl");
            return (Criteria) this;
        }

        public Criteria andKcslNotIn(List<Float> values) {
            addCriterion("kcsl not in", values, "kcsl");
            return (Criteria) this;
        }

        public Criteria andKcslBetween(Float value1, Float value2) {
            addCriterion("kcsl between", value1, value2, "kcsl");
            return (Criteria) this;
        }

        public Criteria andKcslNotBetween(Float value1, Float value2) {
            addCriterion("kcsl not between", value1, value2, "kcsl");
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