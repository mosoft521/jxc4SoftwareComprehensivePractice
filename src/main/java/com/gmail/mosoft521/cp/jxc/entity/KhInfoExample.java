package com.gmail.mosoft521.cp.jxc.entity;

import java.util.ArrayList;
import java.util.List;

public class KhInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KhInfoExample() {
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

        public Criteria andJianIsNull() {
            addCriterion("jian is null");
            return (Criteria) this;
        }

        public Criteria andJianIsNotNull() {
            addCriterion("jian is not null");
            return (Criteria) this;
        }

        public Criteria andJianEqualTo(String value) {
            addCriterion("jian =", value, "jian");
            return (Criteria) this;
        }

        public Criteria andJianNotEqualTo(String value) {
            addCriterion("jian <>", value, "jian");
            return (Criteria) this;
        }

        public Criteria andJianGreaterThan(String value) {
            addCriterion("jian >", value, "jian");
            return (Criteria) this;
        }

        public Criteria andJianGreaterThanOrEqualTo(String value) {
            addCriterion("jian >=", value, "jian");
            return (Criteria) this;
        }

        public Criteria andJianLessThan(String value) {
            addCriterion("jian <", value, "jian");
            return (Criteria) this;
        }

        public Criteria andJianLessThanOrEqualTo(String value) {
            addCriterion("jian <=", value, "jian");
            return (Criteria) this;
        }

        public Criteria andJianLike(String value) {
            addCriterion("jian like", value, "jian");
            return (Criteria) this;
        }

        public Criteria andJianNotLike(String value) {
            addCriterion("jian not like", value, "jian");
            return (Criteria) this;
        }

        public Criteria andJianIn(List<String> values) {
            addCriterion("jian in", values, "jian");
            return (Criteria) this;
        }

        public Criteria andJianNotIn(List<String> values) {
            addCriterion("jian not in", values, "jian");
            return (Criteria) this;
        }

        public Criteria andJianBetween(String value1, String value2) {
            addCriterion("jian between", value1, value2, "jian");
            return (Criteria) this;
        }

        public Criteria andJianNotBetween(String value1, String value2) {
            addCriterion("jian not between", value1, value2, "jian");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andBianmaIsNull() {
            addCriterion("bianma is null");
            return (Criteria) this;
        }

        public Criteria andBianmaIsNotNull() {
            addCriterion("bianma is not null");
            return (Criteria) this;
        }

        public Criteria andBianmaEqualTo(String value) {
            addCriterion("bianma =", value, "bianma");
            return (Criteria) this;
        }

        public Criteria andBianmaNotEqualTo(String value) {
            addCriterion("bianma <>", value, "bianma");
            return (Criteria) this;
        }

        public Criteria andBianmaGreaterThan(String value) {
            addCriterion("bianma >", value, "bianma");
            return (Criteria) this;
        }

        public Criteria andBianmaGreaterThanOrEqualTo(String value) {
            addCriterion("bianma >=", value, "bianma");
            return (Criteria) this;
        }

        public Criteria andBianmaLessThan(String value) {
            addCriterion("bianma <", value, "bianma");
            return (Criteria) this;
        }

        public Criteria andBianmaLessThanOrEqualTo(String value) {
            addCriterion("bianma <=", value, "bianma");
            return (Criteria) this;
        }

        public Criteria andBianmaLike(String value) {
            addCriterion("bianma like", value, "bianma");
            return (Criteria) this;
        }

        public Criteria andBianmaNotLike(String value) {
            addCriterion("bianma not like", value, "bianma");
            return (Criteria) this;
        }

        public Criteria andBianmaIn(List<String> values) {
            addCriterion("bianma in", values, "bianma");
            return (Criteria) this;
        }

        public Criteria andBianmaNotIn(List<String> values) {
            addCriterion("bianma not in", values, "bianma");
            return (Criteria) this;
        }

        public Criteria andBianmaBetween(String value1, String value2) {
            addCriterion("bianma between", value1, value2, "bianma");
            return (Criteria) this;
        }

        public Criteria andBianmaNotBetween(String value1, String value2) {
            addCriterion("bianma not between", value1, value2, "bianma");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("tel is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("tel is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("tel =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("tel <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("tel >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("tel >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("tel <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("tel <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("tel like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("tel not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("tel in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("tel not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("tel between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("tel not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andFaxIsNull() {
            addCriterion("fax is null");
            return (Criteria) this;
        }

        public Criteria andFaxIsNotNull() {
            addCriterion("fax is not null");
            return (Criteria) this;
        }

        public Criteria andFaxEqualTo(String value) {
            addCriterion("fax =", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotEqualTo(String value) {
            addCriterion("fax <>", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThan(String value) {
            addCriterion("fax >", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThanOrEqualTo(String value) {
            addCriterion("fax >=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThan(String value) {
            addCriterion("fax <", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThanOrEqualTo(String value) {
            addCriterion("fax <=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLike(String value) {
            addCriterion("fax like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotLike(String value) {
            addCriterion("fax not like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxIn(List<String> values) {
            addCriterion("fax in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotIn(List<String> values) {
            addCriterion("fax not in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxBetween(String value1, String value2) {
            addCriterion("fax between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotBetween(String value1, String value2) {
            addCriterion("fax not between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andLianIsNull() {
            addCriterion("lian is null");
            return (Criteria) this;
        }

        public Criteria andLianIsNotNull() {
            addCriterion("lian is not null");
            return (Criteria) this;
        }

        public Criteria andLianEqualTo(String value) {
            addCriterion("lian =", value, "lian");
            return (Criteria) this;
        }

        public Criteria andLianNotEqualTo(String value) {
            addCriterion("lian <>", value, "lian");
            return (Criteria) this;
        }

        public Criteria andLianGreaterThan(String value) {
            addCriterion("lian >", value, "lian");
            return (Criteria) this;
        }

        public Criteria andLianGreaterThanOrEqualTo(String value) {
            addCriterion("lian >=", value, "lian");
            return (Criteria) this;
        }

        public Criteria andLianLessThan(String value) {
            addCriterion("lian <", value, "lian");
            return (Criteria) this;
        }

        public Criteria andLianLessThanOrEqualTo(String value) {
            addCriterion("lian <=", value, "lian");
            return (Criteria) this;
        }

        public Criteria andLianLike(String value) {
            addCriterion("lian like", value, "lian");
            return (Criteria) this;
        }

        public Criteria andLianNotLike(String value) {
            addCriterion("lian not like", value, "lian");
            return (Criteria) this;
        }

        public Criteria andLianIn(List<String> values) {
            addCriterion("lian in", values, "lian");
            return (Criteria) this;
        }

        public Criteria andLianNotIn(List<String> values) {
            addCriterion("lian not in", values, "lian");
            return (Criteria) this;
        }

        public Criteria andLianBetween(String value1, String value2) {
            addCriterion("lian between", value1, value2, "lian");
            return (Criteria) this;
        }

        public Criteria andLianNotBetween(String value1, String value2) {
            addCriterion("lian not between", value1, value2, "lian");
            return (Criteria) this;
        }

        public Criteria andLtelIsNull() {
            addCriterion("ltel is null");
            return (Criteria) this;
        }

        public Criteria andLtelIsNotNull() {
            addCriterion("ltel is not null");
            return (Criteria) this;
        }

        public Criteria andLtelEqualTo(String value) {
            addCriterion("ltel =", value, "ltel");
            return (Criteria) this;
        }

        public Criteria andLtelNotEqualTo(String value) {
            addCriterion("ltel <>", value, "ltel");
            return (Criteria) this;
        }

        public Criteria andLtelGreaterThan(String value) {
            addCriterion("ltel >", value, "ltel");
            return (Criteria) this;
        }

        public Criteria andLtelGreaterThanOrEqualTo(String value) {
            addCriterion("ltel >=", value, "ltel");
            return (Criteria) this;
        }

        public Criteria andLtelLessThan(String value) {
            addCriterion("ltel <", value, "ltel");
            return (Criteria) this;
        }

        public Criteria andLtelLessThanOrEqualTo(String value) {
            addCriterion("ltel <=", value, "ltel");
            return (Criteria) this;
        }

        public Criteria andLtelLike(String value) {
            addCriterion("ltel like", value, "ltel");
            return (Criteria) this;
        }

        public Criteria andLtelNotLike(String value) {
            addCriterion("ltel not like", value, "ltel");
            return (Criteria) this;
        }

        public Criteria andLtelIn(List<String> values) {
            addCriterion("ltel in", values, "ltel");
            return (Criteria) this;
        }

        public Criteria andLtelNotIn(List<String> values) {
            addCriterion("ltel not in", values, "ltel");
            return (Criteria) this;
        }

        public Criteria andLtelBetween(String value1, String value2) {
            addCriterion("ltel between", value1, value2, "ltel");
            return (Criteria) this;
        }

        public Criteria andLtelNotBetween(String value1, String value2) {
            addCriterion("ltel not between", value1, value2, "ltel");
            return (Criteria) this;
        }

        public Criteria andMailIsNull() {
            addCriterion("mail is null");
            return (Criteria) this;
        }

        public Criteria andMailIsNotNull() {
            addCriterion("mail is not null");
            return (Criteria) this;
        }

        public Criteria andMailEqualTo(String value) {
            addCriterion("mail =", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotEqualTo(String value) {
            addCriterion("mail <>", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailGreaterThan(String value) {
            addCriterion("mail >", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailGreaterThanOrEqualTo(String value) {
            addCriterion("mail >=", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLessThan(String value) {
            addCriterion("mail <", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLessThanOrEqualTo(String value) {
            addCriterion("mail <=", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLike(String value) {
            addCriterion("mail like", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotLike(String value) {
            addCriterion("mail not like", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailIn(List<String> values) {
            addCriterion("mail in", values, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotIn(List<String> values) {
            addCriterion("mail not in", values, "mail");
            return (Criteria) this;
        }

        public Criteria andMailBetween(String value1, String value2) {
            addCriterion("mail between", value1, value2, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotBetween(String value1, String value2) {
            addCriterion("mail not between", value1, value2, "mail");
            return (Criteria) this;
        }

        public Criteria andXinhangIsNull() {
            addCriterion("xinhang is null");
            return (Criteria) this;
        }

        public Criteria andXinhangIsNotNull() {
            addCriterion("xinhang is not null");
            return (Criteria) this;
        }

        public Criteria andXinhangEqualTo(String value) {
            addCriterion("xinhang =", value, "xinhang");
            return (Criteria) this;
        }

        public Criteria andXinhangNotEqualTo(String value) {
            addCriterion("xinhang <>", value, "xinhang");
            return (Criteria) this;
        }

        public Criteria andXinhangGreaterThan(String value) {
            addCriterion("xinhang >", value, "xinhang");
            return (Criteria) this;
        }

        public Criteria andXinhangGreaterThanOrEqualTo(String value) {
            addCriterion("xinhang >=", value, "xinhang");
            return (Criteria) this;
        }

        public Criteria andXinhangLessThan(String value) {
            addCriterion("xinhang <", value, "xinhang");
            return (Criteria) this;
        }

        public Criteria andXinhangLessThanOrEqualTo(String value) {
            addCriterion("xinhang <=", value, "xinhang");
            return (Criteria) this;
        }

        public Criteria andXinhangLike(String value) {
            addCriterion("xinhang like", value, "xinhang");
            return (Criteria) this;
        }

        public Criteria andXinhangNotLike(String value) {
            addCriterion("xinhang not like", value, "xinhang");
            return (Criteria) this;
        }

        public Criteria andXinhangIn(List<String> values) {
            addCriterion("xinhang in", values, "xinhang");
            return (Criteria) this;
        }

        public Criteria andXinhangNotIn(List<String> values) {
            addCriterion("xinhang not in", values, "xinhang");
            return (Criteria) this;
        }

        public Criteria andXinhangBetween(String value1, String value2) {
            addCriterion("xinhang between", value1, value2, "xinhang");
            return (Criteria) this;
        }

        public Criteria andXinhangNotBetween(String value1, String value2) {
            addCriterion("xinhang not between", value1, value2, "xinhang");
            return (Criteria) this;
        }

        public Criteria andHaoIsNull() {
            addCriterion("hao is null");
            return (Criteria) this;
        }

        public Criteria andHaoIsNotNull() {
            addCriterion("hao is not null");
            return (Criteria) this;
        }

        public Criteria andHaoEqualTo(String value) {
            addCriterion("hao =", value, "hao");
            return (Criteria) this;
        }

        public Criteria andHaoNotEqualTo(String value) {
            addCriterion("hao <>", value, "hao");
            return (Criteria) this;
        }

        public Criteria andHaoGreaterThan(String value) {
            addCriterion("hao >", value, "hao");
            return (Criteria) this;
        }

        public Criteria andHaoGreaterThanOrEqualTo(String value) {
            addCriterion("hao >=", value, "hao");
            return (Criteria) this;
        }

        public Criteria andHaoLessThan(String value) {
            addCriterion("hao <", value, "hao");
            return (Criteria) this;
        }

        public Criteria andHaoLessThanOrEqualTo(String value) {
            addCriterion("hao <=", value, "hao");
            return (Criteria) this;
        }

        public Criteria andHaoLike(String value) {
            addCriterion("hao like", value, "hao");
            return (Criteria) this;
        }

        public Criteria andHaoNotLike(String value) {
            addCriterion("hao not like", value, "hao");
            return (Criteria) this;
        }

        public Criteria andHaoIn(List<String> values) {
            addCriterion("hao in", values, "hao");
            return (Criteria) this;
        }

        public Criteria andHaoNotIn(List<String> values) {
            addCriterion("hao not in", values, "hao");
            return (Criteria) this;
        }

        public Criteria andHaoBetween(String value1, String value2) {
            addCriterion("hao between", value1, value2, "hao");
            return (Criteria) this;
        }

        public Criteria andHaoNotBetween(String value1, String value2) {
            addCriterion("hao not between", value1, value2, "hao");
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