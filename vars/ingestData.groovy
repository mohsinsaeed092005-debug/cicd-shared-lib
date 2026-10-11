def call() {
    sh '''
        . .venv/bin/activate
        cd src
        python -c "from data import load_data; [print(d, load_data(d)[0].shape) for d in ('disease', 'boston')]"
    '''
}
