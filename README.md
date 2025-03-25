# backend

## pull 뒤 프로젝트 실행 방법
```bash
./gradle bootRun
```
---

### 필독사항(서버구동 전 해야하는 내용)

1. **docker-compose up -d**
   ```bash
   $ docker-compose up -d
   ```
   > 도커 폴더로 이동하여 위 명령어를 실행하면 컴포즈 파일 기반 이미지 파일로 컨테이너가 생성됩니다. (디비가 생성됩니다.)

2. **docker ps**
   ```bash
   $ docker ps
   ```
   > 이 명령어는 현재 로컬 기반 연결되어 있는 도커에 올라와 있는 컨테이너를 확인하는 명령어입니다. 입력 후 컨테이너가 뜨지 않으면 생성되지 않은 것입니다. (보통 `compose.yml` 파일에 오류가 있습니다.)

3. **docker exec -it chargeous_mysql mysql -u root -p**
   ```bash
   $ docker exec -it chargeous_mysql mysql -u root -p
   ```
   > 도커로 구축한 DB에 접속하는 명령어입니다. 위 명령어를 입력하면 `root` 계정으로 접속됩니다.  
   현재는 `charge_mg` 사용자명과 `charge_mg` 비밀번호로 생성되어 있습니다. 근데 사용자 권한 문제로 로그인되지 않을 수 있습니다. 일단 `root` 계정으로 접속하여 확인하시길 권장합니다.
```
