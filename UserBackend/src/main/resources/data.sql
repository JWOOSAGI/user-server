-- select * from users;
insert into users (id, username, password, email, name, phone, job) values (1, 'Crown Victoria', 'iF8~QmM}Tvu!', 'ldannel0@ovh.net', '김민준', '18-535-5338', 'VP Sales');
insert into users (id, username, password, email, name, phone, job) values (2, 'Grand Caravan', 'vE9>cK', 'ochoppin1@icq.com', '박서연', '71-768-9366', 'Human Resources Manager');
insert into users (id, username, password, email, name, phone, job) values (3, 'TL', 'fV3*OEPqs', 'faspland2@so-net.ne.jp', '이지아', '41-584-5630', 'Senior Sales Associate');
insert into users (id, username, password, email, name, phone, job) values (4, 'Express 3500', 'eC5?''M*L', 'bsadgrove3@arstechnica.com', '정하윤', '35-418-0746', 'Database Administrator II');
insert into users (id, username, password, email, name, phone, job) values (5, 'Savana 3500', 'pE0$bgX_|b', 'nledward4@pinterest.com', '최준호', '58-674-6158', 'Structural Engineer');
insert into users (id, username, password, email, name, phone, job) values (6, 'Impala', 'sC7@J/Py', 'ffullicks5@marriott.com', '유예진', '46-970-3215', 'Associate Professor');
insert into users (id, username, password, email, name, phone, job) values (7, 'Century', 'qI7,sxt', 'hgerardot6@example.com', '손태양', '65-496-0359', 'Compensation Analyst');
insert into users (id, username, password, email, name, phone, job) values (8, 'Vandura G2500', 'qA5$~/%c', 'dberrecloth7@uiuc.edu', '안도현', '41-118-4180', 'VP Product Management');
insert into users (id, username, password, email, name, phone, job) values (9, 'A4', 'hN7''Ml}EqE', 'nsmallcomb8@jalbum.net', 'Nancy', '68-343-0366', 'Environmental Tech');
insert into users (id, username, password, email, name, phone, job) VALUES (10, 'Ram 3500', 'tK3&Svyw.y', 'crelf9@statcounter.com', 'Cornelius', '29-404-8418', 'Project Manager');
insert into users (id, username, password, email, name, phone, job) VALUES (11, 'Taurus', 'fK0\_Fw0M}KU', 'cturneuxa@ow.ly', 'Conny', '94-100-4993', 'Help Desk Technician');
insert into users (id, username, password, email, name, phone, job) VALUES (12, 'Viper', 'cD3#Nq86?#', 'ncoombeb@ucoz.ru', 'Nickey', '84-085-3545', 'Biostatistician II');
insert into users (id, username, password, email, name, phone, job) VALUES (13, 'Sierra 1500', 'lZ3,X55>"(U>', 'rvaughamc@unblog.fr', 'Rouvin', '47-835-9483', 'Compensation Analyst');
insert into users (id, username, password, email, name, phone, job) VALUES (14, 'Land Cruiser', 'sV0>C9Hw', 'asielyd@altervista.org', 'Adoree', '84-031-4849', 'Information Systems Manager');
insert into users (id, username, password, email, name, phone, job) VALUES (15, 'Avenger', 'wY8#*5zrm`s', 'ssilverwoode@eventbrite.com', 'Steve', '30-792-2106', 'Geological Engineer');


insert into boards (id, title, description) values (1, 'QnA', '무엇이든 질문하세요.');
insert into boards (id, title, description) VALUES (2, '리뷰게시판', '확인해보세요.');


insert into articles (id, board_id, user_id, content, title) values (8025, 1, 15, '정기회의 회기는 100일을, 임시회의 회기는 30일을 초과할 수 없다.
', 'Strategic Air Command');
insert into articles (id, board_id, user_id, content, title) values (3939, 2, 7, '대한민국의 국민이 되는 요건은 법률로 정한다. 모든 국민은 양심의 자유를 가진다.
', 'Galapagos Affair: Satan Came to Eden, The');
insert into articles (id, board_id, user_id, content, title) values (5724, 1, 5, '여자의 근로는 특별한 보호를 받으며, 고용·임금 및 근로조건에 있어서 부당한 차별을 받지 아니한다.
', 'Favela Rising');
insert into articles (id, board_id, user_id, content, title) values (9401, 2, 9, '국무회의는 대통령·국무총리와 15인 이상 30인 이하의 국무위원으로 구성한다.
', 'One Nite In Mongkok (Wong gok hak yau)');
insert into articles (id, board_id, user_id, content, title) values (1030, 1, 8, '국회가 재적의원 과반수의 찬성으로 계엄의 해제를 요구한 때에는 대통령은 이를 해제하여야 한다.
', 'Day of the Triffids, The');
insert into articles (id, board_id, user_id, content, title) values (2166, 2, 4, '국교는 인정되지 아니하며, 종교와 정치는 분리된다. 국가는 모성의 보호를 위하여 노력하여야 한다.
', 'Alamo, The');
insert into articles (id, board_id, user_id, content, title) values (324, 2, 14, '일반사면을 명하려면 국회의 동의를 얻어야 한다. 이 헌법에 의한 최초의 대통령의 임기는 이 헌법시행일로부터 개시한다.
', 'Monster Club, The');
insert into articles (id, board_id, user_id, content, title) values (64131, 2, 2, '대법원장은 국회의 동의를 얻어 대통령이 임명한다. 탄핵결정은 공직으로부터 파면함에 그친다. 그러나, 이에 의하여 민사상이나 형사상의 책임이 면제되지는 아니한다.
', 'Dark Command');
insert into articles (id, board_id, user_id, content, title) values (18851, 2, 2, '모든 국민은 소급입법에 의하여 참정권의 제한을 받거나 재산권을 박탈당하지 아니한다.
', 'The Cop in Blue Jeans');
insert into articles (id, board_id, user_id, content, title) values (31871, 1, 10, '제안된 헌법개정안은 대통령이 20일 이상의 기간 이를 공고하여야 한다.
', 'Festival Express');
insert into articles (id, board_id, user_id, content, title) values (86201, 1, 2, '군인 또는 군무원이 아닌 국민은 대한민국의 영역안에서는 중대한 군사상 기밀·초병·초소·유독음식물공급·포로·군용물에 관한 죄중 법률이 정한 경우와 비상계엄이 선포된 경우를 제외하고는 군사법원의 재판을 받지 아니한다.
', 'Break-in');
insert into articles (id, board_id, user_id, content, title) VALUES (71982, 1, 4, '제1항의 탄핵소추는 국회재적의원 3분의 1 이상의 발의가 있어야 하며, 그 의결은 국회재적의원 과반수의 찬성이 있어야 한다. 다만, 대통령에 대한 탄핵소추는 국회재적의원 과반수의 발의와 국회재적의원 3분의 2 이상의 찬성이 있어야 한다.
', 'Twister');
insert into articles (id, board_id, user_id, content, title) VALUES (61162, 2, 7, '비상계엄하의 군사재판은 군인·군무원의 범죄나 군사에 관한 간첩죄의 경우와 초병·초소·유독음식물공급·포로에 관한 죄중 법률이 정한 경우에 한하여 단심으로 할 수 있다. 다만, 사형을 선고한 경우에는 그러하지 아니하다.
', 'Trekkies 2');
insert into articles (id, board_id, user_id, content, title) VALUES (32200, 2, 8, '모든 국민은 능력에 따라 균등하게 교육을 받을 권리를 가진다.
', '40 Guns to Apache Pass');
insert into articles (id, board_id, user_id, content, title) values (52016, 1, 3, '누구든지 병역의무의 이행으로 인하여 불이익한 처우를 받지 아니한다.
', 'Show Boat');
insert into articles (id, board_id, user_id, content, title) VALUES (56198, 1, 11, '국무위원은 국무총리의 제청으로 대통령이 임명한다. 제2항과 제3항의 처분에 대하여는 법원에 제소할 수 없다.
', 'Prison of the Dead');
insert into articles (id, board_id, user_id, content, title) values (97323, 1, 4, '국회의원은 국회에서 직무상 행한 발언과 표결에 관하여 국회외에서 책임을 지지 아니한다.
', 'Cheaper by the Dozen');
insert into articles (id, board_id, user_id, content, title) values (66151, 1, 15, '형사피해자는 법률이 정하는 바에 의하여 당해 사건의 재판절차에서 진술할 수 있다.
', 'Welcome to L.A.');
insert into articles (id, board_id, user_id, content, title) VALUES (47351, 1, 2, '정당은 그 목적·조직과 활동이 민주적이어야 하며, 국민의 정치적 의사형성에 참여하는데 필요한 조직을 가져야 한다.
', 'Occurrence at Owl Creek Bridge, An (La rivière du hibou)');
insert into articles (id, board_id, user_id, content, title) values (29888, 2, 14, '대통령은 헌법과 법률이 정하는 바에 의하여 국군을 통수한다.
', 'Mouse on the Moon, The');
insert into articles (id, board_id, user_id, content, title) values (62193, 2, 13, '국회의원의 수는 법률로 정하되, 200인 이상으로 한다. 국무총리 또는 행정각부의 장은 소관사무에 관하여 법률이나 대통령령의 위임 또는 직권으로 총리령 또는 부령을 발할 수 있다.
', 'Siblings');
insert into articles (id, board_id, user_id, content, title) values (59956, 2, 11, '국무회의는 대통령·국무총리와 15인 이상 30인 이하의 국무위원으로 구성한다.
', 'Leaves of Grass');
insert into articles (id, board_id, user_id, content, title) values (95287, 1, 14, '대통령은 제3항과 제4항의 사유를 지체없이 공포하여야 한다.
', 'Heroic Cops (Jing wang shuang xiong)');
insert into articles (id, board_id, user_id, content, title) values (30185, 1, 14, '지방자치단체는 주민의 복리에 관한 사무를 처리하고 재산을 관리하며, 법령의 범위안에서 자치에 관한 규정을 제정할 수 있다.
', 'Making a Killing: The Untold Story of Psychotropic Drugging');
insert into articles (id, board_id, user_id, content, title) values (11336, 2, 6, '이 헌법은 1988년 2월 25일부터 시행한다. 다만, 이 헌법을 시행하기 위하여 필요한 법률의 제정·개정과 이 헌법에 의한 대통령 및 국회의원의 선거 기타 이 헌법시행에 관한 준비는 이 헌법시행 전에 할 수 있다.
', 'Who''s That Knocking at My Door?');
insert into articles (id, board_id, user_id, content, title) values (83730, 1, 15, '탄핵소추의 의결을 받은 자는 탄핵심판이 있을 때까지 그 권한행사가 정지된다.
', 'The Adventurers');
insert into articles (id, board_id, user_id, content, title) VALUES (68490, 2, 9, '모든 국민은 보건에 관하여 국가의 보호를 받는다. 원장은 국회의 동의를 얻어 대통령이 임명하고, 그 임기는 4년으로 하며, 1차에 한하여 중임할 수 있다.
', 'America''s Most Haunted Inns');
insert into articles (id, board_id, user_id, content, title) values (7393, 2, 11, '모든 국민은 법률이 정하는 바에 의하여 선거권을 가진다. 감사원은 원장을 포함한 5인 이상 11인 이하의 감사위원으로 구성한다.
', 'Beneath the Valley of the Ultra-Vixens');
insert into articles (id, board_id, user_id, content, title) values (35056, 1, 11, '국가는 주택개발정책등을 통하여 모든 국민이 쾌적한 주거생활을 할 수 있도록 노력하여야 한다.
', 'Children of the Corn V: Fields of Terror');
insert into articles (id, board_id, user_id, content, title) VALUES (9065, 2, 4, '대통령은 국가의 독립·영토의 보전·국가의 계속성과 헌법을 수호할 책무를 진다.
', 'Relative Fear');
insert into articles (id, board_id, user_id, content, title) values (527114, 1, 9, '군인은 현역을 면한 후가 아니면 국무위원으로 임명될 수 없다.
', 'Three Little Words');
insert into articles (id, board_id, user_id, content, title) values (762295, 2, 14, '국가는 지역간의 균형있는 발전을 위하여 지역경제를 육성할 의무를 진다.
', 'Rocks (Rad, Das)');
insert into articles (id, board_id, user_id, content, title) values (83377, 1, 1, '국가안전보장회의는 대통령이 주재한다. 대한민국의 주권은 국민에게 있고, 모든 권력은 국민으로부터 나온다.
', 'Stereo');
insert into articles (id, board_id, user_id, content, title) values (75478, 2, 7, '형사피해자는 법률이 정하는 바에 의하여 당해 사건의 재판절차에서 진술할 수 있다.
', 'Dog Day Afternoon');
insert into articles (id, board_id, user_id, content, title) VALUES (24689, 1, 11, '공공필요에 의한 재산권의 수용·사용 또는 제한 및 그에 대한 보상은 법률로써 하되, 정당한 보상을 지급하여야 한다.
', 'When in Rome');
insert into articles (id, board_id, user_id, content, title) VALUES (21103, 2, 14, '국가는 모성의 보호를 위하여 노력하여야 한다. 국가는 평생교육을 진흥하여야 한다.
', 'Honeydripper');
insert into articles (id, board_id, user_id, content, title) values (371454, 1, 11, '법률은 특별한 규정이 없는 한 공포한 날로부터 20일을 경과함으로써 효력을 발생한다.
', 'Identification of a Woman (Identificazione di una donna)');
insert into articles (id, board_id, user_id, content, title) VALUES (966709, 1, 14, '지방의회의 조직·권한·의원선거와 지방자치단체의 장의 선임방법 기타 지방자치단체의 조직과 운영에 관한 사항은 법률로 정한다.
', 'From Time to Time');
insert into articles (id, board_id, user_id, content, title) VALUES (812252, 1, 10, '대통령은 법률이 정하는 바에 의하여 사면·감형 또는 복권을 명할 수 있다.
', 'Steam');
insert into articles (id, board_id, user_id, content, title) VALUES (54816, 1, 13, '국무회의는 정부의 권한에 속하는 중요한 정책을 심의한다. 대통령은 법률안의 일부에 대하여 또는 법률안을 수정하여 재의를 요구할 수 없다.
', 'Sammy and Rosie Get Laid');
insert into articles (id, board_id, user_id, content, title) values (705116, 1, 12, '국가는 재해를 예방하고 그 위험으로부터 국민을 보호하기 위하여 노력하여야 한다.
', 'Shades of Fern (Stín kapradiny)');
insert into articles (id, board_id, user_id, content, title) values (16184, 1, 4, '훈장등의 영전은 이를 받은 자에게만 효력이 있고, 어떠한 특권도 이에 따르지 아니한다.
', 'Horse Feathers');
insert into articles (id, board_id, user_id, content, title) values (67272, 2, 4, '대통령은 조국의 평화적 통일을 위한 성실한 의무를 진다. 의무교육은 무상으로 한다.
', 'Hi-Line, The');
insert into articles (id, board_id, user_id, content, title) values (676534, 1, 10, '국회는 상호원조 또는 안전보장에 관한 조약, 중요한 국제조직에 관한 조약, 우호통상항해조약, 주권의 제약에 관한 조약, 강화조약, 국가나 국민에게 중대한 재정적 부담을 지우는 조약 또는 입법사항에 관한 조약의 체결·비준에 대한 동의권을 가진다.
', 'Players, The (Les infidèles)');
insert into articles (id, board_id, user_id, content, title) VALUES (798947, 1, 13, '대통령은 전시·사변 또는 이에 준하는 국가비상사태에 있어서 병력으로써 군사상의 필요에 응하거나 공공의 안녕질서를 유지할 필요가 있을 때에는 법률이 정하는 바에 의하여 계엄을 선포할 수 있다.
', 'Dames');
insert into articles (id, board_id, user_id, content, title) values (373759, 1, 5, '국가는 농수산물의 수급균형과 유통구조의 개선에 노력하여 가격안정을 도모함으로써 농·어민의 이익을 보호한다.
', 'Merchant of Four Seasons, The (Händler der vier Jahreszeiten)');
insert into articles (id, board_id, user_id, content, title) values (57823, 1, 7, '국가는 농업 및 어업을 보호·육성하기 위하여 농·어촌종합개발과 그 지원등 필요한 계획을 수립·시행하여야 한다.
', 'See Spot Run');
insert into articles (id, board_id, user_id, content, title) values (595496, 1, 13, '신체장애자 및 질병·노령 기타의 사유로 생활능력이 없는 국민은 법률이 정하는 바에 의하여 국가의 보호를 받는다.
', 'Wild Bees, The (Divoké vcely)');
insert into articles (id, board_id, user_id, content, title) VALUES (77022, 1, 9, '모든 국민은 행위시의 법률에 의하여 범죄를 구성하지 아니하는 행위로 소추되지 아니하며, 동일한 범죄에 대하여 거듭 처벌받지 아니한다.
', 'Kummeli Stories');
insert into articles (id, board_id, user_id, content, title) VALUES (71003, 2, 6, '대통령은 법률에서 구체적으로 범위를 정하여 위임받은 사항과 법률을 집행하기 위하여 필요한 사항에 관하여 대통령령을 발할 수 있다.
', 'Across the Line: The Exodus of Charlie Wright');
insert into articles (id, board_id, user_id, content, title) VALUES (25364, 1, 5, '국가의 세입·세출의 결산, 국가 및 법률이 정한 단체의 회계검사와 행정기관 및 공무원의 직무에 관한 감찰을 하기 위하여 대통령 소속하에 감사원을 둔다.
', 'As Above, So Below');
insert into articles (id, board_id, user_id, content, title) values (457853, 2, 7, '대통령의 임기연장 또는 중임변경을 위한 헌법개정은 그 헌법개정 제안 당시의 대통령에 대하여는 효력이 없다.
', 'Armstrong Lie, The');
insert into articles (id, board_id, user_id, content, title) values (9972, 2, 8, '대통령의 선거에 관한 사항은 법률로 정한다. 국회가 재적의원 과반수의 찬성으로 계엄의 해제를 요구한 때에는 대통령은 이를 해제하여야 한다.
', 'Milky Way, The');
insert into articles (id, board_id, user_id, content, title) values (46338, 2, 5, '선거운동은 각급 선거관리위원회의 관리하에 법률이 정하는 범위안에서 하되, 균등한 기회가 보장되어야 한다.
', 'Harmonists, The');
insert into articles (id, board_id, user_id, content, title) values (99589, 1, 5, '헌법재판소의 장은 국회의 동의를 얻어 재판관중에서 대통령이 임명한다.
', 'Tattooed Life (Irezumi ichidai)');
insert into articles (id, board_id, user_id, content, title) values (69674, 2, 13, '대법원장과 대법관이 아닌 법관은 대법관회의의 동의를 얻어 대법원장이 임명한다.
', 'Lovely Bones, The');
insert into articles (id, board_id, user_id, content, title) VALUES (99229, 1, 4, '이 헌법중 공무원의 임기 또는 중임제한에 관한 규정은 이 헌법에 의하여 그 공무원이 최초로 선출 또는 임명된 때로부터 적용한다.
', 'Looking for Mr. Goodbar');
insert into articles (id, board_id, user_id, content, title) values (784587, 2, 11, '국회는 헌법 또는 법률에 특별한 규정이 없는 한 재적의원 과반수의 출석과 출석의원 과반수의 찬성으로 의결한다. 가부동수인 때에는 부결된 것으로 본다.
', 'Flintstones, The');
insert into articles (id, board_id, user_id, content, title) VALUES (7332927, 2, 14, '체포·구속·압수 또는 수색을 할 때에는 적법한 절차에 따라 검사의 신청에 의하여 법관이 발부한 영장을 제시하여야 한다. 다만, 현행범인인 경우와 장기 3년 이상의 형에 해당하는 죄를 범하고 도피 또는 증거인멸의 염려가 있을 때에는 사후에 영장을 청구할 수 있다.
', 'Frogmen, The');
insert into articles (id, board_id, user_id, content, title) values (12704, 1, 15, '국가원로자문회의의 조직·직무범위 기타 필요한 사항은 법률로 정한다.
', 'Just Bea (Bare Bea)');
insert into articles (id, board_id, user_id, content, title) VALUES (1453879, 1, 8, '대통령·국무총리·국무위원·행정각부의 장·헌법재판소 재판관·법관·중앙선거관리위원회 위원·감사원장·감사위원 기타 법률이 정한 공무원이 그 직무집행에 있어서 헌법이나 법률을 위배한 때에는 국회는 탄핵의 소추를 의결할 수 있다.
', 'Evil Bong');
insert into articles (id, board_id, user_id, content, title) values (42378, 2, 15, '신체장애자 및 질병·노령 기타의 사유로 생활능력이 없는 국민은 법률이 정하는 바에 의하여 국가의 보호를 받는다.
', 'Defender, The (a.k.a. Bodyguard from Beijing, The) (Zhong Nan Hai bao biao)');
insert into articles (id, board_id, user_id, content, title) values (844839, 1, 10, '국무총리는 대통령을 보좌하며, 행정에 관하여 대통령의 명을 받아 행정각부를 통할한다.
', 'Investigating Sex (a.k.a. Intimate Affairs)');
insert into articles (id, board_id, user_id, content, title) values (684817, 2, 14, '국민경제의 발전을 위한 중요정책의 수립에 관하여 대통령의 자문에 응하기 위하여 국민경제자문회의를 둘 수 있다.
', 'Thor: Tales of Asgard');
insert into articles (id, board_id, user_id, content, title) VALUES (373285, 2, 5, '군사법원의 조직·권한 및 재판관의 자격은 법률로 정한다. 언론·출판에 대한 허가나 검열과 집회·결사에 대한 허가는 인정되지 아니한다.
', 'Chatroom');
insert into articles (id, board_id, user_id, content, title) values (9423706, 1, 1, '공무원인 근로자는 법률이 정하는 자에 한하여 단결권·단체교섭권 및 단체행동권을 가진다.
', 'Jubilee');
insert into articles (id, board_id, user_id, content, title) values (23456, 1, 11, '국회의원의 선거구와 비례대표제 기타 선거에 관한 사항은 법률로 정한다.
', 'Bourne Legacy, The');
insert into articles (id, board_id, user_id, content, title) values (485361, 2, 12, '환경권의 내용과 행사에 관하여는 법률로 정한다. 누구든지 체포 또는 구속을 당한 때에는 적부의 심사를 법원에 청구할 권리를 가진다.
', 'We Won''t Grow Old Together (Nous ne vieillirons pas ensemble)');
insert into articles (id, board_id, user_id, content, title) VALUES (178212, 2, 13, '국무총리는 국회의 동의를 얻어 대통령이 임명한다. 제2항과 제3항의 처분에 대하여는 법원에 제소할 수 없다.
', 'Ladies They Talk About');
insert into articles (id, board_id, user_id, content, title) values (85370, 2, 5, '모든 국민은 직업선택의 자유를 가진다. 모든 국민은 소급입법에 의하여 참정권의 제한을 받거나 재산권을 박탈당하지 아니한다.
', 'Big Buck Bunny');
insert into articles (id, board_id, user_id, content, title) VALUES (64699, 2, 11, '법관은 탄핵 또는 금고 이상의 형의 선고에 의하지 아니하고는 파면되지 아니하며, 징계처분에 의하지 아니하고는 정직·감봉 기타 불리한 처분을 받지 아니한다.
', 'Cause for Alarm!');
insert into articles (id, board_id, user_id, content, title) VALUES (853551, 2, 13, '지방자치단체는 주민의 복리에 관한 사무를 처리하고 재산을 관리하며, 법령의 범위안에서 자치에 관한 규정을 제정할 수 있다.
', 'Silkwood');
insert into articles (id, board_id, user_id, content, title) VALUES (178349, 2, 11, '모든 국민은 법률이 정하는 바에 의하여 국방의 의무를 진다.
', 'A Merry Friggin'' Christmas');
insert into articles (id, board_id, user_id, content, title) values (78362, 1, 9, '대통령의 임기는 5년으로 하며, 중임할 수 없다. 모든 국민은 능력에 따라 균등하게 교육을 받을 권리를 가진다.
', 'Curse of the Hedgehog, The (Blestemul ariciului)');
insert into articles (id, board_id, user_id, content, title) values (69788, 1, 6, '국회의원의 수는 법률로 정하되, 200인 이상으로 한다. 선거에 있어서 최고득표자가 2인 이상인 때에는 국회의 재적의원 과반수가 출석한 공개회의에서 다수표를 얻은 자를 당선자로 한다.
', 'Terribly Happy (Frygtelig lykkelig)');
insert into articles (id, board_id, user_id, content, title) values (5023580, 2, 4, '국가는 청원에 대하여 심사할 의무를 진다. 모든 국민은 근로의 의무를 진다. 국가는 근로의 의무의 내용과 조건을 민주주의원칙에 따라 법률로 정한다.
', 'Girl Said No, The');
insert into articles (id, board_id, user_id, content, title) values (311685, 1, 9, '대통령이 궐위된 때 또는 대통령 당선자가 사망하거나 판결 기타의 사유로 그 자격을 상실한 때에는 60일 이내에 후임자를 선거한다.
', 'Wyatt Earp');
insert into articles (id, board_id, user_id, content, title) VALUES (734420, 1, 3, '이 헌법시행 당시에 이 헌법에 의하여 새로 설치될 기관의 권한에 속하는 직무를 행하고 있는 기관은 이 헌법에 의하여 새로운 기관이 설치될 때까지 존속하며 그 직무를 행한다.
', 'Three Days (Tres días)');
insert into articles (id, board_id, user_id, content, title) values (59661, 2, 10, '국가는 농수산물의 수급균형과 유통구조의 개선에 노력하여 가격안정을 도모함으로써 농·어민의 이익을 보호한다.
', 'Come Drink with Me (Da zui xia)');
insert into articles (id, board_id, user_id, content, title) VALUES (58608, 1, 3, '대법관은 대법원장의 제청으로 국회의 동의를 얻어 대통령이 임명한다.
', 'Married Couple, A');
insert into articles (id, board_id, user_id, content, title) values (6312398, 2, 8, '모든 국민은 능력에 따라 균등하게 교육을 받을 권리를 가진다.
', 'Frozen');
insert into articles (id, board_id, user_id, content, title) VALUES (76158, 2, 14, '대통령은 제3항과 제4항의 사유를 지체없이 공포하여야 한다.
', 'At the Circus');
insert into articles (id, board_id, user_id, content, title) VALUES (271346, 1, 11, '제1항의 탄핵소추는 국회재적의원 3분의 1 이상의 발의가 있어야 하며, 그 의결은 국회재적의원 과반수의 찬성이 있어야 한다. 다만, 대통령에 대한 탄핵소추는 국회재적의원 과반수의 발의와 국회재적의원 3분의 2 이상의 찬성이 있어야 한다.
', 'Lady Jane');
insert into articles (id, board_id, user_id, content, title) values (28433, 1, 13, '선거에 있어서 최고득표자가 2인 이상인 때에는 국회의 재적의원 과반수가 출석한 공개회의에서 다수표를 얻은 자를 당선자로 한다.
', 'Mr. Bug Goes to Town (a.k.a. Hoppity Goes to Town)');
insert into articles (id, board_id, user_id, content, title) values (92977, 2, 3, '국채를 모집하거나 예산외에 국가의 부담이 될 계약을 체결하려 할 때에는 정부는 미리 국회의 의결을 얻어야 한다.
', 'Last Dispatch, The');
insert into articles (id, board_id, user_id, content, title) values (10164, 2, 5, '대통령이 제1항의 기간내에 공포나 재의의 요구를 하지 아니한 때에도 그 법률안은 법률로서 확정된다.
', 'Pinocchio');
insert into articles (id, board_id, user_id, content, title) values (472135, 1, 7, '공무원의 신분과 정치적 중립성은 법률이 정하는 바에 의하여 보장된다.
', 'Thanksgiving Family Reunion (National Lampoon''s Holiday Reunion)');
insert into articles (id, board_id, user_id, content, title) VALUES (66213, 1, 12, '대통령의 임기가 만료되는 때에는 임기만료 70일 내지 40일전에 후임자를 선거한다.
', 'Bicycle, Spoon, Apple (Bicicleta, cullera, poma)');
insert into articles (id, board_id, user_id, content, title) VALUES (91385, 2, 11, '국가는 지역간의 균형있는 발전을 위하여 지역경제를 육성할 의무를 진다.
', 'Ghoulies');
insert into articles (id, board_id, user_id, content, title) values (824426, 1, 6, '모든 국민은 종교의 자유를 가진다. 국회는 헌법 또는 법률에 특별한 규정이 없는 한 재적의원 과반수의 출석과 출석의원 과반수의 찬성으로 의결한다. 가부동수인 때에는 부결된 것으로 본다.
', 'Torpedo Run');
insert into articles (id, board_id, user_id, content, title) values (648663, 1, 8, '헌법재판소의 조직과 운영 기타 필요한 사항은 법률로 정한다.
', 'Last Klezmer: Leopold Kozlowski, His Life and Music, The');
insert into articles (id, board_id, user_id, content, title) values (651805, 2, 15, '모든 국민은 인간다운 생활을 할 권리를 가진다. 근로조건의 기준은 인간의 존엄성을 보장하도록 법률로 정한다.
', 'The Trap');
insert into articles (id, board_id, user_id, content, title) values (579929, 1, 7, '법률이 정하는 주요방위산업체에 종사하는 근로자의 단체행동권은 법률이 정하는 바에 의하여 이를 제한하거나 인정하지 아니할 수 있다.
', 'Straw Dogs');
insert into articles (id, board_id, user_id, content, title) VALUES (500039, 2, 14, '대법원장의 임기는 6년으로 하며, 중임할 수 없다. 국가는 국민 모두의 생산 및 생활의 기반이 되는 국토의 효율적이고 균형있는 이용·개발과 보전을 위하여 법률이 정하는 바에 의하여 그에 관한 필요한 제한과 의무를 과할 수 있다.
', 'Mala Noche');
insert into articles (id, board_id, user_id, content, title) values (641261, 2, 6, '대통령은 내우·외환·천재·지변 또는 중대한 재정·경제상의 위기에 있어서 국가의 안전보장 또는 공공의 안녕질서를 유지하기 위하여 긴급한 조치가 필요하고 국회의 집회를 기다릴 여유가 없을 때에 한하여 최소한으로 필요한 재정·경제상의 처분을 하거나 이에 관하여 법률의 효력을 가지는 명령을 발할 수 있다.
', 'Went to Coney Island on a Mission From God... Be Back by Five');
insert into articles (id, board_id, user_id, content, title) VALUES (152971, 2, 8, '헌법개정안이 제2항의 찬성을 얻은 때에는 헌법개정은 확정되며, 대통령은 즉시 이를 공포하여야 한다.
', 'Back-up Plan, The');
insert into articles (id, board_id, user_id, content, title) values (1, 2, 10, '헌법재판소 재판관은 정당에 가입하거나 정치에 관여할 수 없다.
', 'Man Called Sledge, A');
insert into articles (id, board_id, user_id, content, title) values (2, 1, 15, '감사원은 세입·세출의 결산을 매년 검사하여 대통령과 차년도국회에 그 결과를 보고하여야 한다.
', 'In Football We Trust');
insert into articles (id, board_id, user_id, content, title) values (3, 1, 3, '이 헌법공포 당시의 국회의원의 임기는 제1항에 의한 국회의 최초의 집회일 전일까지로 한다.
', 'Riders of Destiny');
insert into articles (id, board_id, user_id, content, title) values (4, 2, 5, '국가는 건전한 소비행위를 계도하고 생산품의 품질향상을 촉구하기 위한 소비자보호운동을 법률이 정하는 바에 의하여 보장한다.
', 'Beautiful Thing');
insert into articles (id, board_id, user_id, content, title) values (5, 1, 6, '모든 국민은 거주·이전의 자유를 가진다. 대통령은 법률에서 구체적으로 범위를 정하여 위임받은 사항과 법률을 집행하기 위하여 필요한 사항에 관하여 대통령령을 발할 수 있다.
', 'Happy Times (Xingfu shiguang)');
insert into articles (id, board_id, user_id, content, title) values (6, 1, 8, '모든 국민은 보건에 관하여 국가의 보호를 받는다. 대법원에 대법관을 둔다. 다만, 법률이 정하는 바에 의하여 대법관이 아닌 법관을 둘 수 있다.
', 'WUSA');
insert into articles (id, board_id, user_id, content, title) values (7, 1, 13, '모든 국민은 법률이 정하는 바에 의하여 선거권을 가진다. 국회의원은 현행범인인 경우를 제외하고는 회기중 국회의 동의없이 체포 또는 구금되지 아니한다.
', 'Firefox');
insert into articles (id, board_id, user_id, content, title) values (8, 1, 13, '대통령은 국무회의의 의장이 되고, 국무총리는 부의장이 된다.
', 'Introducing Dorothy Dandridge');
insert into articles (id, board_id, user_id, content, title) values (9, 2, 2, '각급 선거관리위원회는 선거인명부의 작성등 선거사무와 국민투표사무에 관하여 관계 행정기관에 필요한 지시를 할 수 있다.
', 'Code, The');
insert into articles (id, board_id, user_id, content, title) VALUES (123, 1, 15, '나는 헌법을 준수하고 국가를 보위하며 조국의 평화적 통일과 국민의 자유와 복리의 증진 및 민족문화의 창달에 노력하여 대통령으로서의 직책을 성실히 수행할 것을 국민 앞에 엄숙히 선서합니다.
', 'Breath (Soom)');
insert into articles (id, board_id, user_id, content, title) values (5953543, 1, 12, '법률이 정하는 주요방위산업체에 종사하는 근로자의 단체행동권은 법률이 정하는 바에 의하여 이를 제한하거나 인정하지 아니할 수 있다.
', 'Misérables, Les');
insert into articles (id, board_id, user_id, content, title) values (94123543, 1, 14, '국가는 전통문화의 계승·발전과 민족문화의 창달에 노력하여야 한다.
', 'Golden Christmas, A');
insert into articles (id, board_id, user_id, content, title) values (97131, 1, 15, '대통령이 임시회의 집회를 요구할 때에는 기간과 집회요구의 이유를 명시하여야 한다.
', 'Dogtooth (Kynodontas)');
insert into articles (id, board_id, user_id, content, title) values (82534, 2, 14, '국군은 국가의 안전보장과 국토방위의 신성한 의무를 수행함을 사명으로 하며, 그 정치적 중립성은 준수된다.
', 'Sinbad (Szindbád)');
insert into articles (id, board_id, user_id, content, title) values (54706, 2, 9, '대통령의 임기는 5년으로 하며, 중임할 수 없다. 타인의 범죄행위로 인하여 생명·신체에 대한 피해를 받은 국민은 법률이 정하는 바에 의하여 국가로부터 구조를 받을 수 있다.
', 'Mountain Men, The');
insert into articles (id, board_id, user_id, content, title) values (4935418, 2, 12, '모든 국민은 법률이 정하는 바에 의하여 납세의 의무를 진다.
', 'East Palace West Palace (Dong gong xi gong)');
insert into articles (id, board_id, user_id, content, title) values (751317, 1, 11, '국무위원은 국정에 관하여 대통령을 보좌하며, 국무회의의 구성원으로서 국정을 심의한다.
', 'Once Upon a Time in China (Wong Fei Hung)');
insert into articles (id, board_id, user_id, content, title) values (78560, 1, 6, '국회에 제출된 법률안 기타의 의안은 회기중에 의결되지 못한 이유로 폐기되지 아니한다. 다만, 국회의원의 임기가 만료된 때에는 그러하지 아니하다.
', 'Englishman Who Went Up a Hill But Came Down a Mountain, The');
insert into articles (id, board_id, user_id, content, title) VALUES (867191, 1, 6, '대통령은 조약을 체결·비준하고, 외교사절을 신임·접수 또는 파견하며, 선전포고와 강화를 한다.
', 'Special Correspondents (Envoyés très spéciaux)');
insert into articles (id, board_id, user_id, content, title) values (189916, 2, 6, '대통령은 법률이 정하는 바에 의하여 사면·감형 또는 복권을 명할 수 있다.
', 'Five Minutes to Live');
insert into articles (id, board_id, user_id, content, title) VALUES (20074, 1, 9, '대법원과 각급법원의 조직은 법률로 정한다. 군인은 현역을 면한 후가 아니면 국무총리로 임명될 수 없다.
', 'Confessor, The (a.k.a. The Good Shepherd)');
insert into articles (id, board_id, user_id, content, title) values (194382, 2, 7, '전직대통령의 신분과 예우에 관하여는 법률로 정한다. 대통령의 임기연장 또는 중임변경을 위한 헌법개정은 그 헌법개정 제안 당시의 대통령에 대하여는 효력이 없다.
', 'House of Mirth, The');
insert into articles (id, board_id, user_id, content, title) values (18652, 1, 12, '체포·구속·압수 또는 수색을 할 때에는 적법한 절차에 따라 검사의 신청에 의하여 법관이 발부한 영장을 제시하여야 한다. 다만, 현행범인인 경우와 장기 3년 이상의 형에 해당하는 죄를 범하고 도피 또는 증거인멸의 염려가 있을 때에는 사후에 영장을 청구할 수 있다.
', 'Edukators, The (Die Fetten Jahre sind vorbei)');