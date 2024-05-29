<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Pacman Game</title>
    <style>
        /* 게임 스타일링 */
        #gameCanvas {
            border: 1px solid black;
        }
    </style>
</head>
<body>
    <canvas id="gameCanvas" width="400" height="400"></canvas>
    <script>
        // 팩맨 게임 로직 작성
        const canvas = document.getElementById('gameCanvas');
        const ctx = canvas.getContext('2d');

        let pacman = {
            x: 50,
            y: 50,
            speed: 5,
            dx: 0, // x축 방향 속도
            dy: 0  // y축 방향 속도
        };

        function drawPacman() {
            ctx.clearRect(0, 0, canvas.width, canvas.height);
            ctx.fillStyle = 'yellow';
            ctx.beginPath();
            ctx.arc(pacman.x, pacman.y, 15, 0.2 * Math.PI, 1.8 * Math.PI);
            ctx.lineTo(pacman.x, pacman.y);
            ctx.closePath();
            ctx.fill();
        }

        function update() {
            drawPacman();
            pacman.x += pacman.dx;
            pacman.y += pacman.dy;
            // 팩맨이 캔버스 경계를 벗어나지 않도록 제어
            if (pacman.x < 15) {
                pacman.x = 15;
            }
            if (pacman.x > canvas.width - 15) {
                pacman.x = canvas.width - 15;
            }
            if (pacman.y < 15) {
                pacman.y = 15;
            }
            if (pacman.y > canvas.height - 15) {
                pacman.y = canvas.height - 15;
            }
        }

        function movePacman(direction) {
            switch (direction) {
                case 'up':
                    pacman.dx = 0;
                    pacman.dy = -pacman.speed;
                    break;
                case 'down':
                    pacman.dx = 0;
                    pacman.dy = pacman.speed;
                    break;
                case 'left':
                    pacman.dx = -pacman.speed;
                    pacman.dy = 0;
                    break;
                case 'right':
                    pacman.dx = pacman.speed;
                    pacman.dy = 0;
                    break;
            }
        }

        document.addEventListener('keydown', function(event) {
            switch (event.key) {
                case 'ArrowUp':
                case 'ArrowDown':
                case 'ArrowLeft':
                case 'ArrowRight':
                    movePacman(event.key.replace('Arrow', '').toLowerCase());
                    break;
            }
        });

        setInterval(update, 1000 / 60);
    </script>
</body>
</html>