package com.gmail.mosoft521.cp.jxc.entity;

import java.util.ArrayList;
import java.util.List;

public class SpInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpInfoExample() {
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

        public Criteria andCdIsNull() {
            addCriterion("cd is null");
            return (Criteria) this;
        }

        public Criteria andCdIsNotNull() {
            addCriterion("cd is not null");
            return (Criteria) this;
        }

        public Criteria andCdEqualTo(String value) {
            addCriterion("cd =", value, "cd");
            return (Criteria) this;
        }

        public Criteria andCdNotEqualTo(String value) {
            addCriterion("cd <>", value, "cd");
            return (Criteria) this;
        }

        public Criteria andCdGreaterThan(String value) {
            addCriterion("cd >", value, "cd");
            return (Criteria) this;
        }

        public Criteria andCdGreaterThanOrEqualTo(String value) {
            addCriterion("cd >=", value, "cd");
            return (Criteria) this;
        }

        public Criteria andCdLessThan(String value) {
            addCriterion("cd <", value, "cd");
            return (Criteria) this;
        }

        public Criteria andCdLessThanOrEqualTo(String value) {
            addCriterion("cd <=", value, "cd");
            return (Criteria) this;
        }

        public Criteria andCdLike(String value) {
            addCriterion("cd like", value, "cd");
            return (Criteria) this;
        }

        public Criteria andCdNotLike(String value) {
            addCriterion("cd not like", value, "cd");
            return (Criteria) this;
        }

        public Criteria andCdIn(List<String> values) {
            addCriterion("cd in", values, "cd");
            return (Criteria) this;
        }

        public Criteria andCdNotIn(List<String> values) {
            addCriterion("cd not in", values, "cd");
            return (Criteria) this;
        }

        public Criteria andCdBetween(String value1, String value2) {
            addCriterion("cd between", value1, value2, "cd");
            return (Criteria) this;
        }

        public Criteria andCdNotBetween(String value1, String value2) {
            addCriterion("cd not between", value1, value2, "cd");
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

        public Criteria andPhIsNull() {
            addCriterion("ph is null");
            return (Criteria) this;
        }

        public Criteria andPhIsNotNull() {
            addCriterion("ph is not null");
            return (Criteria) this;
        }

        public Criteria andPhEqualTo(String value) {
            addCriterion("ph =", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhNotEqualTo(String value) {
            addCriterion("ph <>", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhGreaterThan(String value) {
            addCriterion("ph >", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhGreaterThanOrEqualTo(String value) {
            addCriterion("ph >=", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhLessThan(String value) {
            addCriterion("ph <", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhLessThanOrEqualTo(String value) {
            addCriterion("ph <=", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhLike(String value) {
            addCriterion("ph like", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhNotLike(String value) {
            addCriterion("ph not like", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhIn(List<String> values) {
            addCriterion("ph in", values, "ph");
            return (Criteria) this;
        }

        public Criteria andPhNotIn(List<String> values) {
            addCriterion("ph not in", values, "ph");
            return (Criteria) this;
        }

        public Criteria andPhBetween(String value1, String value2) {
            addCriterion("ph between", value1, value2, "ph");
            return (Criteria) this;
        }

        public Criteria andPhNotBetween(String value1, String value2) {
            addCriterion("ph not between", value1, value2, "ph");
            return (Criteria) this;
        }

        public Criteria andPzwhIsNull() {
            addCriterion("pzwh is null");
            return (Criteria) this;
        }

        public Criteria andPzwhIsNotNull() {
            addCriterion("pzwh is not null");
            return (Criteria) this;
        }

        public Criteria andPzwhEqualTo(String value) {
            addCriterion("pzwh =", value, "pzwh");
            return (Criteria) this;
        }

        public Criteria andPzwhNotEqualTo(String value) {
            addCriterion("pzwh <>", value, "pzwh");
            return (Criteria) this;
        }

        public Criteria andPzwhGreaterThan(String value) {
            addCriterion("pzwh >", value, "pzwh");
            return (Criteria) this;
        }

        public Criteria andPzwhGreaterThanOrEqualTo(String value) {
            addCriterion("pzwh >=", value, "pzwh");
            return (Criteria) this;
        }

        public Criteria andPzwhLessThan(String value) {
            addCriterion("pzwh <", value, "pzwh");
            return (Criteria) this;
        }

        public Criteria andPzwhLessThanOrEqualTo(String value) {
            addCriterion("pzwh <=", value, "pzwh");
            return (Criteria) this;
        }

        public Criteria andPzwhLike(String value) {
            addCriterion("pzwh like", value, "pzwh");
            return (Criteria) this;
        }

        public Criteria andPzwhNotLike(String value) {
            addCriterion("pzwh not like", value, "pzwh");
            return (Criteria) this;
        }

        public Criteria andPzwhIn(List<String> values) {
            addCriterion("pzwh in", values, "pzwh");
            return (Criteria) this;
        }

        public Criteria andPzwhNotIn(List<String> values) {
            addCriterion("pzwh not in", values, "pzwh");
            return (Criteria) this;
        }

        public Criteria andPzwhBetween(String value1, String value2) {
            addCriterion("pzwh between", value1, value2, "pzwh");
            return (Criteria) this;
        }

        public Criteria andPzwhNotBetween(String value1, String value2) {
            addCriterion("pzwh not between", value1, value2, "pzwh");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("memo is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("memo is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("memo =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("memo <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("memo >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("memo >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("memo <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("memo <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("memo like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("memo not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("memo in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("memo not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("memo between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("memo not between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andGysnameIsNull() {
            addCriterion("gysname is null");
            return (Criteria) this;
        }

        public Criteria andGysnameIsNotNull() {
            addCriterion("gysname is not null");
            return (Criteria) this;
        }

        public Criteria andGysnameEqualTo(String value) {
            addCriterion("gysname =", value, "gysname");
            return (Criteria) this;
        }

        public Criteria andGysnameNotEqualTo(String value) {
            addCriterion("gysname <>", value, "gysname");
            return (Criteria) this;
        }

        public Criteria andGysnameGreaterThan(String value) {
            addCriterion("gysname >", value, "gysname");
            return (Criteria) this;
        }

        public Criteria andGysnameGreaterThanOrEqualTo(String value) {
            addCriterion("gysname >=", value, "gysname");
            return (Criteria) this;
        }

        public Criteria andGysnameLessThan(String value) {
            addCriterion("gysname <", value, "gysname");
            return (Criteria) this;
        }

        public Criteria andGysnameLessThanOrEqualTo(String value) {
            addCriterion("gysname <=", value, "gysname");
            return (Criteria) this;
        }

        public Criteria andGysnameLike(String value) {
            addCriterion("gysname like", value, "gysname");
            return (Criteria) this;
        }

        public Criteria andGysnameNotLike(String value) {
            addCriterion("gysname not like", value, "gysname");
            return (Criteria) this;
        }

        public Criteria andGysnameIn(List<String> values) {
            addCriterion("gysname in", values, "gysname");
            return (Criteria) this;
        }

        public Criteria andGysnameNotIn(List<String> values) {
            addCriterion("gysname not in", values, "gysname");
            return (Criteria) this;
        }

        public Criteria andGysnameBetween(String value1, String value2) {
            addCriterion("gysname between", value1, value2, "gysname");
            return (Criteria) this;
        }

        public Criteria andGysnameNotBetween(String value1, String value2) {
            addCriterion("gysname not between", value1, value2, "gysname");
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