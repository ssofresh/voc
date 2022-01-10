insert into company(company_id, name) values('1', '운송사');
insert into company(company_id, name) values('2', '고객사');


insert into voc(content, attributable_rsn, compensation_rqst_yn, company_id) values('배송누락입니다', '운송사 잘못입니다', 'Y', 1);
insert into voc(content, attributable_rsn, compensation_rqst_yn, company_id) values('배송실수입니다', '운송사 잘못입니다', 'Y', 1);
insert into voc(content, attributable_rsn, compensation_rqst_yn, company_id) values('배송물품파손입니다', '운송사 잘못입니다', 'Y', 1);

insert into penalty(penalty_cost, confirm_yn, objection_yn, objection_rsn, penalty_voc_id) values('10000', 'Y', 'N', '없음', 1);
insert into penalty(penalty_cost, confirm_yn, objection_yn, objection_rsn, penalty_voc_id) values('20000', 'Y', 'N', '없음', 2);
insert into penalty(penalty_cost, confirm_yn, objection_yn, objection_rsn, penalty_voc_id) values('30000', 'Y', 'N', '없음', 3);

insert into compensation(cost, compensation_voc_id) values('10000', '1');
insert into compensation(cost, compensation_voc_id) values('20000', '2');
insert into compensation(cost, compensation_voc_id) values('30000', '3');



