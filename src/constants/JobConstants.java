package constants;

import server.ServerProperties;

public class JobConstants {

    public static final boolean enableJobs = true;
    public static final int jobOrder = 176;

    public enum LoginJob {

        末日反抗軍(0),
        冒險家(1),
        皇家騎士團(2),
        狂狼勇士(3),
        龍魔導士(4),
        精靈遊俠(5),
        惡魔(6),
        幻影俠盜(7),
        影武者(8),
        米哈逸(9),
        夜光(10),
        凱撒(11),
        天使破壞者(12),
        重砲指揮官(13),
        傑諾(14),
        神之子(15),
        隱月(16),
        皮卡啾(17),
        蒼龍俠客(18),
        劍豪(19),
        陰陽師(20),
        幻獸師(21),;
        private final int jobType, flag = JobFlag.開啟.getFlag();

        private LoginJob(int jobType) {
            this.jobType = jobType;
        }

        public int getJobType() {
            return jobType;
        }

        public int getFlag() {
            return JobFlag.valueOf(ServerProperties.getProperty("Job" + jobType, JobFlag.getByValue(flag).name())).getFlag();
        }

        public void setFlag(int info) {
            if (info == flag) {
                ServerProperties.removeProperty("Job" + jobType);
                return;
            }
            ServerProperties.setProperty("Job" + jobType, JobFlag.getByValue(info).name());
        }

        public enum JobFlag {

            關閉(0),
            開啟(1);
            private final int flag;

            private JobFlag(int flag) {
                this.flag = flag;
            }

            public int getFlag() {
                return flag;
            }

            public static JobFlag getByValue(int g) {
                for (JobFlag e : values()) {
                    if (e.getFlag() == g) {
                        return e;
                    }
                }
                return null;
            }
        }
    }
}
