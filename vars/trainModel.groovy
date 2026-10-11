def call(String dataset, String model, String alias = 'Challenger') {
    sh """
        . .venv/bin/activate
        python src/train.py --dataset ${dataset} --model ${model} --alias ${alias}
    """
}
